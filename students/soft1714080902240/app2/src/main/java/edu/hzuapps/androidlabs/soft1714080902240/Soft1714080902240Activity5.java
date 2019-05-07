package edu.hzuapps.androidlabs.soft1714080902240;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Soft1714080902240Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft17140809022405);


        final MyImageView myImageView = findViewById(R.id.image_view);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageView.setImageURL("http://c.hiphotos.baidu.com/zhidao/pic/item/b3fb43166d224f4ac217158f0df790529922d1a4.jpg");
            }
        });

    }
}
