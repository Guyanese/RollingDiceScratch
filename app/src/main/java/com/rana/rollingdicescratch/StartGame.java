package com.rana.rollingdicescratch;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Ryan on 11/5/2014.
 */

public class StartGame extends Activity {
    Button btnRoll;
    ImageView imgdice1;
    int count = -1;
    private int[] arDiceImages = { R.drawable.imgdice1,R.drawable.imgdice2, R.drawable.imgdice3,
            R.drawable.imgdice4, R.drawable.imgdice5,  R.drawable.imgdice6 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startgame);

        btnRoll = (Button) findViewById(R.id.btnRollDice);
        imgdice1 = (ImageView) findViewById(R.id.imgdice1);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + 1;
                imgdice1.setImageResource(arDiceImages[count]);
            }
        });
    }
}

