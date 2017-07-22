package com.example.ayagamal.instabug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationMode;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Button ReportButton = (Button) findViewById(R.id.report2);


        ReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Instabug.invoke(InstabugInvocationMode.PROMPT_OPTION );





            }
        });
    }
}
