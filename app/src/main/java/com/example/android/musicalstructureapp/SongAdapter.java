package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Spi_ros on 17/03/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTitleTextView = convertView.findViewById(R.id.song_title_text_view);
        songTitleTextView.setText(currentSong.getSongTitle());

        TextView artistNameTextView = convertView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(currentSong.getArtistName());

        ImageView playIconView = convertView.findViewById(R.id.play_icon);
        playIconView.setImageResource(currentSong.getPlayIcon());

        return convertView;
    }
}
