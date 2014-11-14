package com.rana.rollingdicescratch;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;

/**
 * Created by Ryan on 11/5/2014.
 */
public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

    }

    public void MainStartClick(View v) {
        //http://stackoverflow.com/questions/20382521/using-multiple-button-to-start-different-activities-android
        //Used this source to help  simplify the button code.
        switch (v.getId()) {
            case R.id.btnStartGame:
                Intent intent = new Intent(Main.this, StartGame.class);
                startActivity(intent);
                break;
        }
    }
}