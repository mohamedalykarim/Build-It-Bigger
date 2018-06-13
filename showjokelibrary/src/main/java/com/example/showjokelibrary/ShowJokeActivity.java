package com.example.showjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ShowJokeActivity extends AppCompatActivity {

    private static final String EXTRA_JOKE = "joke";
    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        jokeTextView = findViewById(R.id.joke_text);

        Intent intent = getIntent();
        if (intent != null){
            String joke = intent.getStringExtra(EXTRA_JOKE);

            jokeTextView.setText(joke);
        }
    }
}
