package com.example.ayagamal.instabug;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.instabug.library.Instabug;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.bugreporting.model.Bug;
import com.instabug.library.invocation.InstabugInvocationMode;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Button ReportButton = (Button) findViewById(R.id.report2);

        final ConstraintLayout layout2 = (ConstraintLayout) findViewById(R.id.layout2);


        ReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Instabug.invoke(InstabugInvocationMode.PROMPT_OPTION );

                Instabug.setOnSdkDismissedCallback(new OnSdkDismissedCallback() {
                    @Override
                    public void onSdkDismissed(OnSdkDismissedCallback.DismissType dismissType, Bug.Type bugType){
                        layout2.setBackgroundColor(Color.RED);
                    }
                });



            }
        });
    }
}
