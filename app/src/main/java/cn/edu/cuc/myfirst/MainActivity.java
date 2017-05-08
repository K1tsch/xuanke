package cn.edu.cuc.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.List;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private List<CharSequence> weekList = null;
    private ArrayAdapter<CharSequence> weekAdapter = null;
    private Spinner weekSpinner= null;

    Intent intent1;
    Intent intent2;
    Intent intent3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到Spinner控件
        weekSpinner = (Spinner)super.findViewById(R.id.week);
        weekSpinner.setPrompt("第1周");
        weekList = new ArrayList<CharSequence>();
        weekList.add("第2周");
        weekList.add("第3周");
        weekList.add("第4周");
        weekList.add("第5周");
        weekList.add("第6周");
        weekList.add("第7周");
        weekList.add("第8周");
        weekList.add("第9周");
        weekList.add("第10周");
        weekList.add("第11周");
        weekList.add("第12周");
        weekList.add("第13周");
        weekList.add("第14周");
        weekList.add("第15周");
        weekList.add("第16周");
        weekAdapter = new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,weekList);
        weekAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weekSpinner.setAdapter(weekAdapter);


        intent1 = new Intent(this,ChooseActivity.class);
        intent2 = new Intent(this,SpyActivity.class);
        intent3 = new Intent(this,MeActivity.class);
        Button button1=(Button)findViewById(R.id.chooseLesson);
        Button button2=(Button)findViewById(R.id.spy);
        Button button3=(Button)findViewById(R.id.me);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(intent3);
            }
        });

    }
}

