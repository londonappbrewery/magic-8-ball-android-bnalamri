package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] ballArray = {
        R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5,
    };

        final Button myButton;
        myButton = findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(5);
                ImageView ball_To_Display = findViewById(R.id.image_eightBall);
                ball_To_Display.setImageResource(ballArray[randomNumber]);
            }
        });

    }
}
