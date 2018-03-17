package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        gestureObject = new GestureDetectorCompat(this, new MainActivity.LearnGesture());

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Prince & The Revolution", "Let's Go Crazy", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "Take Me with U", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "The Beautiful Ones", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "Computer Blue", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "Darling Nikki", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "When doves cry", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "I Would Die 4 U", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "Baby I'm a Star", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("Prince & The Revolution", "Purple Rain", "Purple Rain", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Modern Love", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "China Girl", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Let's Dance", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Without You", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Ricochet", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Criminal World", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Cat People (Putting Out Fire)", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("David Bowie", "Shake It", "Let's Dance", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Give Life Back to Music", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "The Game of Love", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Giorgio by Moroder", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Within", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Instant Crush", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Lose Yourself to Dance", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Touch", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Get Lucky", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Beyond", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Motherboard", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Fragments of Time", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Doin' It Right", "Random Access Memories", R.drawable.play_arrow));
        songs.add(new Song("Daft Punk", "Contact", "Random Access Memories", R.drawable.play_arrow));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, RightActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_to_left_a, R.anim.right_to_left_b);
            }
        });
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

                Intent intent = new Intent(MainActivity.this, LeftActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_to_right_a, R.anim.left_to_right_b);

            } else if (event2.getX() < event1.getX()) {

                Intent intent = new Intent(MainActivity.this, RightActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_to_left_a, R.anim.right_to_left_b);


            }
            return true;
        }
    }
}
