package com.seulandroid.hw2_2_20191037;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button imgBtn;
    ImageView image;

    int rotation=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtn = (Button) findViewById(R.id.imgBtn);
        image = (ImageView) findViewById(R.id.image);

        imgBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                rotation +=10;

                image.setRotation(rotation);
            }
        });
    }
}