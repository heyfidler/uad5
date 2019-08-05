package com.fidflop.jokesdisplaymodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        Log.i("JokeDisplayActivity!!!", joke);

        TextView jokeTV = findViewById(R.id.joke_tv);
        jokeTV.setText(joke);

    }

}
