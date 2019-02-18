package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {
    public LayoutInflater layoutInflater;
    private List<Song> mSongs;

    public SongAdapter(Context context, List<Song> songs) {
        this.mSongs = songs;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    @NonNull
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                             int viewType) {
        View view = layoutInflater.inflate(R.layout.item_song, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        binData(mSongs.get(position), holder);
    }

    @Override
    public int getItemCount() {
        return mSongs != null ? mSongs.size() : 0;
    }

    public void binData(Song song, SongViewHolder holder) {
        holder.mTextViewSong.setText(song.getName());
        holder.mTextViewSinger.setText(song.getSinger());
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewSong;
        private TextView mTextViewSinger;

        public SongViewHolder(View view) {
            super(view);
            mTextViewSong = view.findViewById(R.id.text_song);
            mTextViewSinger = view.findViewById(R.id.text_singer);
        }
    }
}
