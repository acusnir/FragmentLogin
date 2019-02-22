package com.concordia.cejv669.fragmentlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent i = getIntent();

        String userName = i.getStringExtra("uname");

        TextView tv = findViewById(R.id.welcomeText);

        tv.setText("Welcome, " + userName);

    }
}
