package com.example.yimingli.magic8ball;

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

        final int[] ball_poll = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button ask_button = findViewById(R.id.askButton);
        final ImageView ball_image = findViewById(R.id.ball);

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int number = randomGenerator.nextInt(5);
                ball_image.setImageResource(ball_poll[number]);
            }
        });
    }
}
