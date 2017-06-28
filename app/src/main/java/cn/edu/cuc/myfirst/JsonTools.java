package cn.edu.cuc.myfirst;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wenyang on 2017/5/27.
 */

public class JsonTools
{
    /**
     * 得到一个json类型的字符串对象
     * @param key
     * @param value
     * @return
     */
    public static String getJsonString(String key, Object value) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        //put和element都是往JSONObject对象中放入 key/value 对
//        jsonObject.put(key, value);
        jsonObject.put(key, value);
        return jsonObject.toString();
    }

    /**
     * 得到一个json对象
     * @param key
     * @param value
     * @return
     */
    public static JSONObject getJsonObject(String key, Object value) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(key, value);
        return jsonObject;
    }

}