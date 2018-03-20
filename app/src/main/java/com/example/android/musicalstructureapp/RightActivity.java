package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class RightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        Intent intent = getIntent();
        intent.getExtras().getInt("Test");
    }

    @Override
    public void onBackPressed() {
        //your code when back button pressed

        Intent intent = new Intent(RightActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_to_right_a, R.anim.left_to_right_b);
    }
}
