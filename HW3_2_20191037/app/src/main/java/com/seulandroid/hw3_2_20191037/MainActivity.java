package com.seulandroid.hw3_2_20191037;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout purple, yellow, black;
    String result;
    float width, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        purple = (LinearLayout) findViewById(R.id.layout1);
        yellow = (LinearLayout) findViewById(R.id.layout2);
        black = (LinearLayout) findViewById(R.id.layout3);

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = purple.getWidth();
                height = purple.getHeight();
                result = "레이아웃의 넓이 " + width + " 높이는 " + height;

                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = yellow.getWidth();
                height = yellow.getHeight();
                result = "레이아웃의 넓이 " + width + " 높이는 " + height;

                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = black.getWidth();
                height = black.getHeight();
                result = "레이아웃의 넓이 " + width + " 높이는 " + height;

                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
            }
        });

    }
}