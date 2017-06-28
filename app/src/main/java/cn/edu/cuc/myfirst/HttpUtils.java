package cn.edu.cuc.myfirst;

/**
 * Created by wenyang on 2017/6/5.
 */


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.example.utils.ParseHtml;

public class HttpUtils
{
    private static HttpClient httpClient;
    private static List<String> cookies;



    /**
     * @param path    请求的服务器URL地址
     * @param encode    编码格式
     * @return    将服务器端返回的数据转换成String
     */
    public static String sendPostMessage(Map<String,String> map, String encode)
    {
        String path = "http://jw.cuc.edu.cn/academic/j_acegi_security_check";
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        if(map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                NameValuePair nameValuePair = new BasicNameValuePair(entry.getKey(), entry.getValue());
                list.add(nameValuePair);
            }
        }

        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpEntity entity = new UrlEncodedFormEntity(list, encode);//HttpEntity
            HttpPost post = new HttpPost(path);
            post.setEntity(entity);

            HttpClient client = httpClient;

            HttpResponse httpResponse = client.execute(post);
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                cookies = ((AbstractHttpClient) client).getCookieStore().getCookies();
                for (int i = 0; i < cookies.size(); i++) {
                    System.out.println("...................................");
                    System.out.println("name:" + cookies.get(i).getName());//09-10 09:08:51.890: I/System.out(24503): name:JSESSIONID
                    //09-10 09:08:51.890: I/System.out(24503): getComment:null
                    System.out.println("getComment:" + cookies.get(i).getComment());
                    //09-10 09:08:51.890: I/System.out(24503): getValue:febr_8qMVGnZFbh49X0_u
                    System.out.println("getValue:" + cookies.get(i).getValue());
                }
                HttpEntity httpEntity = httpResponse.getEntity();
                InputStream inputStream = httpEntity.getContent();
                return changeInputeStream(inputStream, encode);
            }
        }
        catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "";
    }
}