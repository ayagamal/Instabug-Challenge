package com.example.ayagamal.instabug;

import android.app.Application;
import android.graphics.Color;
import android.widget.Button;



import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.bugreporting.model.Bug;
import com.instabug.library.invocation.InstabugInvocationEvent;


public class CustomApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();


        new Instabug.Builder(this, "8af4da99468a016d51c3ffacca62b87f")
                .setInvocationEvent(InstabugInvocationEvent.SHAKE)
                .build();

        new Instabug.Builder(this, "8af4da99468a016d51c3ffacca62b87f")
                .setSurveysState(Feature.State.DISABLED)
                .build();





    }}


