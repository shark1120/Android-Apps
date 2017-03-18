package com.example.skabir.guessanumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void message (String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess (View view){

        EditText guessEditText = (EditText) findViewById(R.id.guessNum);

        int guessInt  = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > randomNumber) {

            message("Lower!");

            //Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        }

        else if (guessInt < randomNumber) {

            message("Higher!");

            //Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
        }

        else {

            message("Correct! Try Again");

            //Toast.makeText(MainActivity.this, "Correct! Try again", Toast.LENGTH_SHORT).show();

            Random rand = new Random();

            randomNumber = rand.nextInt(20)+1;

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20)+1;
    }
}
