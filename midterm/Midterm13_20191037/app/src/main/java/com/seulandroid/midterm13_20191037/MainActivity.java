package com.seulandroid.midterm13_20191037;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;

public class MainActivity extends TabActivity  {

    RadioGroup radioGroup;
    RadioButton cat,dog,horse,rabbit;
    Button display;
    ImageView imgAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rdoGroup);
        cat = (RadioButton) findViewById(R.id.btnCat);
        dog = (RadioButton) findViewById(R.id.btnDog);
        horse = (RadioButton) findViewById(R.id.btnHorse);
        rabbit = (RadioButton) findViewById(R.id.btnRabbit);

        display = (Button) findViewById(R.id.DisplayBtn);
        imgAnimal = (ImageView)findViewById(R.id.imgPet);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.btnCat:
                        imgAnimal.setImageResource(R.drawable.cat);
                        break;
                    case R.id.btnDog:
                        imgAnimal.setImageResource(R.drawable.dog);
                        break;
                    case R.id.btnHorse:
                        imgAnimal.setImageResource(R.drawable.horse);
                        break;
                    case R.id.btnRabbit:
                        imgAnimal.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        imgAnimal.setImageResource(R.drawable.r11);
                }
            }
        });

        TabHost tabHost=getTabHost();
        TabHost.TabSpec tabSpecdog=tabHost.newTabSpec("first").setIndicator("선호도조사");
        tabSpecdog.setContent(R.id.선호도조사);
        tabHost.addTab(tabSpecdog);
        TabHost.TabSpec tabSpeccat=tabHost.newTabSpec("second").setIndicator("통계");
        tabSpeccat.setContent(R.id.통계);
        tabHost.addTab(tabSpeccat);
        TabHost.TabSpec tabSpecrab=tabHost.newTabSpec("third").setIndicator("결과");
        tabSpecrab.setContent(R.id.결과);
        tabHost.addTab(tabSpecrab);
        TabHost.TabSpec tabSpeclion=tabHost.newTabSpec("four").setIndicator("SETTINGS");
        tabSpeclion.setContent(R.id.SETTINGS);
        tabHost.addTab(tabSpeclion);
        tabHost.setCurrentTab(0);


    }

}