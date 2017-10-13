package com.example.android.combo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void socialmedia(View view) {
        Intent i1 = new Intent(this, SocialActivity.class);
        startActivity(i1);
    }

    public void news(View view) {
        Intent i2 = new Intent(this, NewsActivity.class);
        startActivity(i2);
    }

    public void youtube(View view) {
        Intent i3 = new Intent(this, YoutubeActivity.class);
        startActivity(i3);
    }
}

