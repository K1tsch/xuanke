package cn.edu.cuc.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpyActivity extends AppCompatActivity {

    Intent intent1;
    Intent intent2;
    Intent intent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spy);

        intent1 = new Intent(this,ChooseActivity.class);
        intent2 = new Intent(this,MeActivity.class);
        intent3 = new Intent(this,MainActivity.class);
        Button button1=(Button)findViewById(R.id.chooseLesson);
        Button button2=(Button)findViewById(R.id.me);
        Button button3=(Button)findViewById(R.id.timetable);

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
