package edu.hzuapps.androidlabs.Soft1714080902115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View V){
               Intent intent = new Intent(MainActivity.this,Soft1714080902115Activity.class);
               startActivity(intent);
           }

        });
    }
}
