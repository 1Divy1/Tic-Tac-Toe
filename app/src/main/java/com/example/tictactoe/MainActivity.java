package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // switch between players' turns
    boolean bPlayerOne;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPlayerOne = true;

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
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
    }

    // responsible for game mechanics
    public void checkGameStatus() {

    }

    public void button1(View view) {
        Log.d("DEBUG: ", "button 1 pressed");
        updateBox(1);
    }
    public void button2(View view) {
        Log.d("DEBUG: ", "button 2 pressed");
        updateBox(2);
    }
    public void button3(View view) {
        Log.d("DEBUG: ", "button 3 pressed");
        updateBox(3);
    }
    public void button4(View view) {
        Log.d("DEBUG: ", "button 4 pressed");
        updateBox(4);
    }
    public void button5(View view) {
        Log.d("DEBUG: ", "button 5 pressed");
        updateBox(5);
    }
    public void button6(View view) {
        Log.d("DEBUG: ", "button 6 pressed");
        updateBox(6);
    }
    public void button7(View view) {
        Log.d("DEBUG: ", "button 7 pressed");
        updateBox(7);
    }
    public void button8(View view) {
        Log.d("DEBUG: ", "button 8 pressed");
        updateBox(8);
    }
    public void button9(View view) {
        Log.d("DEBUG: ", "button 9 pressed");
        updateBox(9);
    }
}