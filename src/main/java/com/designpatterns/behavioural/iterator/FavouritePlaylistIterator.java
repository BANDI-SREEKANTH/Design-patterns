package com.designpatterns.behavioural.iterator;

public class FavouritePlaylistIterator implements PlaylistIterator{
    private PlayList playList;
    private int index;
    public FavouritePlaylistIterator(PlayList playlist)
    {
        this.playList=playlist;
        this.index=0;
    }
    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }

    @Override
    public boolean hasNext() {
        while(index < playList.getSongs().size())
        {
            if(playList.getSongs().get(index).contains("Fav"))
            {
                return  true;
            }

        }
        return false;
    }
}
