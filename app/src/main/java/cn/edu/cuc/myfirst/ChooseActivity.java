package cn.edu.cuc.myfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    Intent intent1;
    Intent intent2;
    Intent intent3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        intent1 = new Intent(this,MainActivity.class);
        intent2 = new Intent(this,SpyActivity.class);
        intent3 = new Intent(this,MeActivity.class);
        Button button1=(Button)findViewById(R.id.timetable);
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
