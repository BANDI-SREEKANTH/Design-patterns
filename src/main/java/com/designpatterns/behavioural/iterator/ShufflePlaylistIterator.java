package com.designpatterns.behavioural.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ShufflePlaylistIterator implements PlaylistIterator{

    private PlayList playList;
    private int index;
    private ArrayList<String> shuffledSongs;
    public ShufflePlaylistIterator(PlayList playList)
    {
        this.playList=playList;
        this.index=0;
        this.shuffledSongs=new ArrayList<>(playList.getSongs());
        Collections.shuffle(shuffledSongs);
    }
    @Override
    public boolean hasNext() {
        return index < playList.getSongs().size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
