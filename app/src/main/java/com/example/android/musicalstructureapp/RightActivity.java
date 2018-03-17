package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class RightActivity extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        gestureObject = new GestureDetectorCompat(this, new RightActivity.LearnGesture());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class LearnGesture extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onFling (MotionEvent event1, MotionEvent event2,
                                float velocityX, float velocityY) {
            if (event2.getX() > event1.getX()) {

                Intent intent = new Intent(RightActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_to_right_a, R.anim.left_to_right_b);

            }
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        //your code when back button pressed

        Intent intent = new Intent(RightActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_to_right_a, R.anim.left_to_right_b);
    }
}
