package com.example.recyclerview;

public class Song {
    private int mImageUrl;
    private String mName;
    private String mSinger;

    public Song(int imageUrl, String name, String singer) {
        mImageUrl = imageUrl;
        mName = name;
        mSinger = singer;
    }

    public Song(String name, String singer) {
        mName = name;
        mSinger = singer;
    }

    public int getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(int imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSinger() {
        return mSinger;
    }

    public void setSinger(String singer) {
        mSinger = singer;
    }
}
