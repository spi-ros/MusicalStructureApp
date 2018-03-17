package com.example.android.musicalstructureapp;

/**
 * Created by Spi_ros on 17/03/2018.
 */

public class Song {

    private String mArtistName;

    private String mSongTitle;

    private String mAlbumTitle;

    private int mPlayIcon;

    public Song(String artistName, String songTitle, String albumTitle, int playIcon) {
        mArtistName = artistName;
        mSongTitle = songTitle;
        mAlbumTitle = albumTitle;
        mPlayIcon = playIcon;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    public int getPlayIcon() {
        return mPlayIcon;
    }
}
