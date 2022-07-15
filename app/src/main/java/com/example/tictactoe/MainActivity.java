package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean bPlayerOne; // switch between players' turns
    boolean bAllClicked;
    boolean bBTN1;
    boolean bBTN2;
    boolean bBTN3;
    boolean bBTN4;
    boolean bBTN5;
    boolean bBTN6;
    boolean bBTN7;
    boolean bBTN8;
    boolean bBTN9;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    int player_X_score;
    int player_0_score;

    TextView playerXScoreText;
    TextView player0ScoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player_X_score = 0;
        player_0_score = 0;

        playerXScoreText = findViewById(R.id.playerXscore);
        player0ScoreText = findViewById(R.id.player0score);
        playerXScoreText.setText(String.valueOf(player_X_score));
        player0ScoreText.setText(String.valueOf(player_0_score));
        playerXScoreText.setTextSize(30);
        player0ScoreText.setTextSize(30);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        bPlayerOne = true;
        bAllClicked = false;
        bBTN1 = false;
        bBTN2 = false;
        bBTN3 = false;
        bBTN4 = false;
        bBTN5 = false;
        bBTN6 = false;
        bBTN7 = false;
        bBTN8 = false;
        bBTN9 = false;
    }

    public void updatePlayerScore() {

    }

    public void updateBox(int btnID) {
        if(bPlayerOne == true) {
            // Fill box with X
            Log.d("Debug: ", "Box = X");
            fillBoxX(btnID);
            bPlayerOne = false;
        }
        else if(bPlayerOne == false) {
            // Fill box with 0
            Log.d("Debug: ", "Box = 0");
            fillBox0(btnID);
            bPlayerOne = true;
        }
        checkGameStatus();
    }

    // change color of the winning boxes
    public void updateWinBoxesColor() {

    }

    public void resetGame() {

    }

    // responsible for game mechanics
    public void checkGameStatus() {
        Log.d("DEBUG: ", "checkGameStatus() called");
    }

    public void buttonReset(View view) {
        Log.d("DEBUG: ", "Reset button clicked");
    }

    public void fillBoxX(int btnID) {
        switch(btnID) {
            case 1:
                btn1.setText("X");
                btn1.setTextSize(15);
                break;
            case 2:
                btn2.setText("X");
                btn2.setTextSize(15);
                break;
            case 3:
                btn3.setText("X");
                btn3.setTextSize(15);
                break;
            case 4:
                btn4.setText("X");
                btn4.setTextSize(15);
                break;
            case 5:
                btn5.setText("X");
                btn5.setTextSize(15);
                break;
            case 6:
                btn6.setText("X");
                btn6.setTextSize(15);
                break;
            case 7:
                btn7.setText("X");
                btn7.setTextSize(15);
                break;
            case 8:
                btn8.setText("X");
                btn8.setTextSize(15);
                break;
            case 9:
                btn9.setText("X");
                btn9.setTextSize(15);
                break;
        }
    }
    public void fillBox0(int btnID) {
        switch(btnID) {
            case 1:
                btn1.setText("0");
                btn1.setTextSize(15);
                break;
            case 2:
                btn2.setText("0");
                btn2.setTextSize(15);
                break;
            case 3:
                btn3.setText("0");
                btn3.setTextSize(15);
                break;
            case 4:
                btn4.setText("0");
                btn4.setTextSize(15);
                break;
            case 5:
                btn5.setText("0");
                btn5.setTextSize(15);
                break;
            case 6:
                btn6.setText("0");
                btn6.setTextSize(15);
                break;
            case 7:
                btn7.setText("0");
                btn7.setTextSize(15);
                break;
            case 8:
                btn8.setText("0");
                btn8.setTextSize(15);
                break;
            case 9:
                btn9.setText("0");
                btn9.setTextSize(15);
                break;
        }
    }

    public void button1(View view) {
        if(bBTN1 != true) {
            Log.d("DEBUG: ", "button 1 clicked");
            updateBox(1);
            bBTN1 = true;
        }
        else {
            Log.d("DEBUG: ", "button 1 already clicked");
        }
    }
    public void button2(View view) {
        if(bBTN2 != true) {
            Log.d("DEBUG: ", "button 2 clicked");
            updateBox(2);
            bBTN2 = true;
        }
        else {
            Log.d("DEBUG: ", "button 2 already clicked");
        }
    }
    public void button3(View view) {
        if(bBTN3 != true) {
            Log.d("DEBUG: ", "button 3 clicked");
            updateBox(3);
            bBTN3 = true;
        }
        else {
            Log.d("DEBUG: ", "button 3 already clicked");
        }
    }
    public void button4(View view) {
        if(bBTN4 != true) {
            Log.d("DEBUG: ", "button 4 clicked");
            updateBox(4);
            bBTN4 = true;
        }
        else {
            Log.d("DEBUG: ", "button 4 already clicked");
        }
    }
    public void button5(View view) {
        if(bBTN5 != true) {
            Log.d("DEBUG: ", "button 5 clicked");
            updateBox(5);
            bBTN5 = true;
        }
        else {
            Log.d("DEBUG: ", "button 5 already clicked");
        }
    }
    public void button6(View view) {
        if(bBTN6 != true) {
            Log.d("DEBUG: ", "button 6 clicked");
            updateBox(6);
            bBTN6 = true;
        }
        else {
            Log.d("DEBUG: ", "button 6 already clicked");
        }
    }
    public void button7(View view) {
        if(bBTN7 != true) {
            Log.d("DEBUG: ", "button 7 clicked");
            updateBox(7);
            bBTN7 = true;
        }
        else {
            Log.d("DEBUG: ", "button 7 already clicked");
        }
    }
    public void button8(View view) {
        if(bBTN8 != true) {
            Log.d("DEBUG: ", "button 8 clicked");
            updateBox(8);
            bBTN8 = true;
        }
        else {
            Log.d("DEBUG: ", "button 1 already clicked");
        }
    }
    public void button9(View view) {
        if(bBTN9 != true) {
            Log.d("DEBUG: ", "button 9 clicked");
            updateBox(9);
            bBTN9 = true;
        }
        else {
            Log.d("DEBUG: ", "button 1 already clicked");
        }
    }
}