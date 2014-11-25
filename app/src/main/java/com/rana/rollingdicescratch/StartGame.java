package com.rana.rollingdicescratch;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Ryan on 11/5/2014.
 */

public class StartGame extends Activity {
    Button btnRoll;
    ImageView imgdice1;
    Random random = new Random();
    int count = -1;
    private int[] arDiceImages = { R.drawable.imgdice1,R.drawable.imgdice2, R.drawable.imgdice3,
            R.drawable.imgdice4, R.drawable.imgdice5,  R.drawable.imgdice6 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startgame);

        btnRoll = (Button) findViewById(R.id.btnRollDice);
       // https://www.youtube.com/watch?v=O6Tad0BlqUY&index=3&list=PLvnXjBkwUhDEfjK1pqT8LsGWPyFuzO5Zu
        imgdice1 = (ImageView) findViewById(R.id.imgdice1);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //https://www.youtube.com/watch?v=yLwhzIPPYxo - Just used the code he used, here.
                count = count + 1;
                imgdice1.setImageResource(arDiceImages[count]);
                //int index = random.nextInt(arDiceImages[]);
                //imgdice1.setImageResource(index);
            }
        });
    }
}

