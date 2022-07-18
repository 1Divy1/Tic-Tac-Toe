package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean bPlayerOne; // switch between players' turns
    boolean bAllClicked;
    boolean bBtn1Clicked;
    boolean bBtn2Clicked;
    boolean bBtn3Clicked;
    boolean bBtn4Clicked;
    boolean bBtn5Clicked;
    boolean bBtn6Clicked;
    boolean bBtn7Clicked;
    boolean bBtn8Clicked;
    boolean bBtn9Clicked;

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
        bBtn1Clicked = false;
        bBtn2Clicked = false;
        bBtn3Clicked = false;
        bBtn4Clicked = false;
        bBtn5Clicked = false;
        bBtn6Clicked = false;
        bBtn7Clicked = false;
        bBtn8Clicked = false;
        bBtn9Clicked = false;
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

    public void disableButtonClick() {
        Log.d("DEBUG: ", "Click disabled");
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        btn5.setClickable(false);
        btn6.setClickable(false);
        btn7.setClickable(false);
        btn8.setClickable(false);
        btn9.setClickable(false);
    }

    // responsible for game mechanics
    public void checkGameStatus() {

        ///// HORIZONTAL
        if(btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "") {
            if(btn1.getText() == btn2.getText() && btn1.getText() == btn3.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn1.setBackgroundColor(Color.parseColor("#07fc03"));
                btn2.setBackgroundColor(Color.parseColor("#07fc03"));
                btn3.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn1.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn1.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        if(btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "") {
            if(btn4.getText() == btn5.getText() && btn4.getText() == btn6.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn4.setBackgroundColor(Color.parseColor("#07fc03"));
                btn5.setBackgroundColor(Color.parseColor("#07fc03"));
                btn6.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn4.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn4.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        if(btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != "") {
            if(btn7.getText() == btn8.getText() && btn7.getText() == btn9.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn7.setBackgroundColor(Color.parseColor("#07fc03"));
                btn8.setBackgroundColor(Color.parseColor("#07fc03"));
                btn9.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn7.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn7.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        ///// VERTICAL
        if(btn1.getText() != "" && btn4.getText() != "" && btn7.getText() != "") {
            if(btn1.getText() == btn4.getText() && btn1.getText() == btn7.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn1.setBackgroundColor(Color.parseColor("#07fc03"));
                btn4.setBackgroundColor(Color.parseColor("#07fc03"));
                btn7.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn1.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn1.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        if(btn2.getText() != "" && btn5.getText() != "" && btn8.getText() != "") {
            if(btn2.getText() == btn5.getText() && btn2.getText() == btn8.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn2.setBackgroundColor(Color.parseColor("#07fc03"));
                btn5.setBackgroundColor(Color.parseColor("#07fc03"));
                btn8.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn2.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn2.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        if(btn3.getText() != "" && btn6.getText() != "" && btn9.getText() != "") {
            if(btn3.getText() == btn6.getText() && btn3.getText() == btn9.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn3.setBackgroundColor(Color.parseColor("#07fc03"));
                btn6.setBackgroundColor(Color.parseColor("#07fc03"));
                btn9.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn3.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn3.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        ///// DIAGONAL
        if(btn1.getText() != "" && btn5.getText() != "" && btn9.getText() != "") {
            if(btn1.getText() == btn5.getText() && btn1.getText() == btn9.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn1.setBackgroundColor(Color.parseColor("#07fc03"));
                btn5.setBackgroundColor(Color.parseColor("#07fc03"));
                btn9.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn1.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn1.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
        if(btn7.getText() != "" && btn5.getText() != "" && btn3.getText() != "") {
            if(btn7.getText() == btn5.getText() && btn7.getText() == btn3.getText()) {
                Log.d("DEBUG: ", "Game Winned");
                btn7.setBackgroundColor(Color.parseColor("#07fc03"));
                btn5.setBackgroundColor(Color.parseColor("#07fc03"));
                btn3.setBackgroundColor(Color.parseColor("#07fc03"));
                disableButtonClick();
                if(btn7.getText().equals("X")) {
                    player_X_score++;
                    playerXScoreText.setText(String.valueOf(player_X_score));
                }
                else if(btn7.getText().equals("0")) {
                    player_0_score++;
                    player0ScoreText.setText(String.valueOf(player_0_score));
                }
            }
        }
    }

    public void buttonReset(View view) {
        Log.d("DEBUG: ", "Reset button clicked");

        // Change text to empty
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        // Change box color to default
        btn1.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn2.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn3.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn4.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn5.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn6.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn7.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn8.setBackgroundColor(Color.parseColor("#FF007BFF"));
        btn9.setBackgroundColor(Color.parseColor("#FF007BFF"));

        // Set clicked event boolean to false
        bBtn1Clicked = false;
        bBtn2Clicked = false;
        bBtn3Clicked = false;
        bBtn4Clicked = false;
        bBtn5Clicked = false;
        bBtn6Clicked = false;
        bBtn7Clicked = false;
        bBtn8Clicked = false;
        bBtn9Clicked = false;

        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
        btn5.setClickable(true);
        btn6.setClickable(true);
        btn7.setClickable(true);
        btn8.setClickable(true);
        btn9.setClickable(true);
    }

    public void fillBoxX(int btnID) {
        switch(btnID) {
            case 1:
                btn1.setText("X");
                btn1.setTextSize(45);
                break;
            case 2:
                btn2.setText("X");
                btn2.setTextSize(45);
                break;
            case 3:
                btn3.setText("X");
                btn3.setTextSize(45);
                break;
            case 4:
                btn4.setText("X");
                btn4.setTextSize(45);
                break;
            case 5:
                btn5.setText("X");
                btn5.setTextSize(45);
                break;
            case 6:
                btn6.setText("X");
                btn6.setTextSize(45);
                break;
            case 7:
                btn7.setText("X");
                btn7.setTextSize(45);
                break;
            case 8:
                btn8.setText("X");
                btn8.setTextSize(45);
                break;
            case 9:
                btn9.setText("X");
                btn9.setTextSize(45);
                break;
        }
    }
    public void fillBox0(int btnID) {
        switch(btnID) {
            case 1:
                btn1.setText("0");
                btn1.setTextSize(45);
                break;
            case 2:
                btn2.setText("0");
                btn2.setTextSize(45);
                break;
            case 3:
                btn3.setText("0");
                btn3.setTextSize(45);
                break;
            case 4:
                btn4.setText("0");
                btn4.setTextSize(45);
                break;
            case 5:
                btn5.setText("0");
                btn5.setTextSize(45);
                break;
            case 6:
                btn6.setText("0");
                btn6.setTextSize(45);
                break;
            case 7:
                btn7.setText("0");
                btn7.setTextSize(45);
                break;
            case 8:
                btn8.setText("0");
                btn8.setTextSize(45);
                break;
            case 9:
                btn9.setText("0");
                btn9.setTextSize(45);
                break;
        }
    }

    public void button1(View view) {
        if(bBtn1Clicked != true) {
            Log.d("DEBUG: ", "button 1 clicked");
            btn1.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(1);
            bBtn1Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 1 already clicked");
        }
    }
    public void button2(View view) {
        if(bBtn2Clicked != true) {
            Log.d("DEBUG: ", "button 2 clicked");
            btn2.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(2);
            bBtn2Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 2 already clicked");
        }
    }
    public void button3(View view) {
        if(bBtn3Clicked != true) {
            Log.d("DEBUG: ", "button 3 clicked");
            btn3.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(3);
            bBtn3Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 3 already clicked");
        }
    }
    public void button4(View view) {
        if(bBtn4Clicked != true) {
            Log.d("DEBUG: ", "button 4 clicked");
            btn4.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(4);
            bBtn4Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 4 already clicked");
        }
    }
    public void button5(View view) {
        if(bBtn5Clicked != true) {
            Log.d("DEBUG: ", "button 5 clicked");
            btn5.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(5);
            bBtn5Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 5 already clicked");
        }
    }
    public void button6(View view) {
        if(bBtn6Clicked != true) {
            Log.d("DEBUG: ", "button 6 clicked");
            btn6.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(6);
            bBtn6Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 6 already clicked");
        }
    }
    public void button7(View view) {
        if(bBtn7Clicked != true) {
            Log.d("DEBUG: ", "button 7 clicked");
            btn7.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(7);
            bBtn7Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 7 already clicked");
        }
    }
    public void button8(View view) {
        if(bBtn8Clicked != true) {
            Log.d("DEBUG: ", "button 8 clicked");
            btn8.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(8);
            bBtn8Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 8 already clicked");
        }
    }
    public void button9(View view) {
        if(bBtn9Clicked != true) {
            Log.d("DEBUG: ", "button 9 clicked");
            btn9.setBackgroundColor(Color.parseColor("#03e6ff"));
            updateBox(9);
            bBtn9Clicked = true;
        }
        else {
            Log.d("DEBUG: ", "button 9 already clicked");
        }
    }
}