package com.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean firstPlayersTurn = true;

    public void playButtonPressed(View view) {
        setContentView(R.layout.gamegrid);
    }

    public void grid1Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row1col1);
        whichImage(iv);
    }
    public void grid2Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row1col2);
        whichImage(iv);
    }
    public void grid3Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row1col3);
        whichImage(iv);
    }
    public void grid4Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row2col1);
        whichImage(iv);
    }
    public void grid5Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row2col2);
        whichImage(iv);
    }
    public void grid6Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row2col3);
        whichImage(iv);
    }
    public void grid7Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row3col1);
        whichImage(iv);
    }
    public void grid8Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row3col2);
        whichImage(iv);
    }
    public void grid9Pressed(View view) {
        //sets view based on bool
        ImageView iv = findViewById(R.id.row3col3);
        whichImage(iv);
    }

    public void whichImage(ImageView iv)
    {
        if (firstPlayersTurn)
        {
            iv.setBackgroundResource(R.drawable.eagle);
        }
        else{
            iv.setBackgroundResource(R.drawable.wing);
        }
        switchPlayer();
    }

    public void switchPlayer()
    {
        if (firstPlayersTurn)
        {
            firstPlayersTurn = false;
        }
        else{
            firstPlayersTurn = true;
        }

    }
}