package com.example.ayagamal.instabug;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.invocation.InstabugInvocationMode;
import com.instabug.library.view.annotation.ColorPickerPopUpView;

import java.util.Locale;



public class MainActivity extends AppCompatActivity {


    Color pallete = new Color();

    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button RedButton = (Button) findViewById(R.id.red);
        final Button GreenButton = (Button) findViewById(R.id.green);
        Button NextButton = (Button) findViewById(R.id.next);
        Button ReportButton = (Button) findViewById(R.id.report1);
        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);



        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.RED);

                Instabug.setTheme(InstabugColorTheme.InstabugColorThemeDark);
            }
        });


        GreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);

                Instabug.setTheme(InstabugColorTheme.InstabugColorThemeDark);


            }
        });

       NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, NextPage.class);

                startActivity(intent);
           }
       });

        ReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




           Instabug.invoke(InstabugInvocationMode.PROMPT_OPTION );







            }
        });
        


    }






}

