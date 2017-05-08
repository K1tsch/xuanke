package cn.edu.cuc.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        intent = new Intent(this,LoginActivity.class);
        Button button=(Button)findViewById(R.id.sign_out);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(intent);
            }
        });
    }
}
