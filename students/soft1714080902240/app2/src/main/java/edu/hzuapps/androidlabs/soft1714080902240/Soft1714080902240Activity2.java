package edu.hzuapps.androidlabs.soft1714080902240;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Soft1714080902240Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft17140809022402);

        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(Soft1714080902240Activity2.this,Soft1714080902240Activity4.class);
                startActivity(intent);
            }
        });

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(Soft1714080902240Activity2.this,Soft1714080902240Activity5.class);
                startActivity(intent);
            }
        });

    }
}
