package com.designpatterns.behavioural.iterator;
import java.lang.invoke.SwitchPoint;
import java.util.*;
public class PlayList
{
    List<String> songs;
    public PlayList()
    {
        songs=new ArrayList<>();
    }
    public void addSong(String song)
    {
        if(songs.contains(song))
        {
            System.out.println("Song already in playlist");
        }
        else
        {
            songs.add(song);
        }
    }
    public PlaylistIterator iterator(String type)
    {
        switch(type)
        {
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffled":
                return new ShufflePlaylistIterator(this);
            case "Favourite":
                return new FavouritePlaylistIterator(this);

        }
        return null;
    }
    public List<String> getSongs()
    {
        return  songs;
    }

}
