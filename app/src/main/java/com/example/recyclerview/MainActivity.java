package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerSong;
    private List<Song> mSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
        initUi();
    }

    public void getControls() {
        mRecyclerSong = findViewById(R.id.recycler_song);
    }

    public void initUi() {
        initData();
        mRecyclerSong.setHasFixedSize(true);
        RecyclerView.Adapter adapter = new SongAdapter(this, mSongs);
        mRecyclerSong.setAdapter(adapter);
    }

    public void initData() {
        mSongs = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            mSongs.add(new Song(getString(R.string.title_song), getString(R.string.title_singer)));
        }
    }
}
