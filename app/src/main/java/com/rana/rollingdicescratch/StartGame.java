package com.rana.rollingdicescratch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ryan on 11/5/2014.
 */

public class StartGame extends Activity {
    private int nNumOfDice;
    private int nNumOfSides;

    int[] arDice1 = new int[]{R.drawable.dice1, R.drawable.dice2,
            R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    int[] arDice2 = new int[]{R.drawable.secdice1, R.drawable.secdice2,
            R.drawable.secdice3, R.drawable.secdice4, R.drawable.secdice5, R.drawable.secdice6};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startgame);

        nNumOfDice=0;
        nNumOfSides=0;
    }
    public void RollDice(View v) {
        //http://stackoverflow.com/questions/20382521/using-multiple-button-to-start-different-activities-android
        //Used this source to help  simplify the button code.
        switch (v.getId()) {
            case R.id.btnRollDice:
                rollDice1();
                break;
        }
    }
    //https://github.com/Kapin/Dice-Roller/blob/master/src/com/kapin/diceroller/DiceRollerActivity.java#L220
    private void rollDice1()
    {
        int diceTotal=0;
        String diceRolls="";
        for(int i = 0;i<arDice1.length;++i){
            int temp = diceRoll();
            diceTotal+=temp;
            diceRolls+=(temp+"");
            if(i<nNumOfDice-1)
            {
                diceRolls+=" ";
            }
        }
    }
    private int diceRoll(){
        return ((int)(Math.random()*nNumOfSides+1));
    }
}



