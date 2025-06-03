package com.designpatterns.behavioural.iterator;

public class SimplePlaylistIterator implements PlaylistIterator{

    private PlayList playList;
    private int index;
    public SimplePlaylistIterator(PlayList playlist)
    {
        this.playList=playlist;
        index=0;
    }
    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < playList.getSongs().size();
    }
}
