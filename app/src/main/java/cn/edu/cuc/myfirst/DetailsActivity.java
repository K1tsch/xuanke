package cn.edu.cuc.myfirst;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        intent = new Intent(this,MainActivity.class);
        Button button=(Button)findViewById(R.id.deleteLesson);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(intent);
            }
        });
    }

}
