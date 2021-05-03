package com.example.midterm11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub,btnMul,btnDiv;
    EditText editResult;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);

        btnAdd = (Button) findViewById(R.id.button1);
        btnSub = (Button) findViewById(R.id.button2);
        btnMul = (Button) findViewById(R.id.button3);
        btnDiv = (Button) findViewById(R.id.button4);

        editResult = (EditText) findViewById(R.id.editText3);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edit1.getText().toString().equals("")||edit1.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"먼저 숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());

                result = num1+num2;
                editResult.setText(result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")||edit1.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"먼저 숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());

                result = num1-num2;
                editResult.setText(result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")||edit1.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"먼저 숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());

                result = num1*num2;
                editResult.setText(result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")||edit1.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"먼저 숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());

                if(num2==0){
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                    return;
                }
                result = num1/num2;
                editResult.setText(result.toString());
            }
        });
    }
}