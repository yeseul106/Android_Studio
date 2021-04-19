package com.seulandroid.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1; Button button2;
    EditText editText1;
    RadioGroup radioGroup1;
    RadioButton radioBtn1; RadioButton radioBtn2;
    ImageView image1;

    @Override
    //oncreate => c 언어의 main 함수라고 생각 (기본이 되는 메소드)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //레이아웃을 화면에 표시
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        editText1 = (EditText) findViewById(R.id.editText1);
        radioBtn1 = (RadioButton) findViewById(R.id.radioBtn1);
        radioBtn2 = (RadioButton) findViewById(R.id.radioBtn2);
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        image1 = (ImageView) findViewById(R.id.image1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            //버튼을 클릭했을 때 작동할 코드를 이 부분에 삽입
            public void onClick(View view) {
                //버튼을 누르면 메세지가 잠깐 나오는 코드
                Toast.makeText(getApplicationContext(),editText1.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText1.getText().toString()));
                startActivity(mintent);
            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioBtn1){
                    image1.setImageResource(R.drawable.realq10);
                }
                else if(i==R.id.radioBtn2){
                    image1.setImageResource(R.drawable.r);
                }
                else{
                    image1.setImageResource(R.drawable.realq10);
                }
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }
}