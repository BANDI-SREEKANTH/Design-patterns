package com.designpatterns.behavioural.iterator;
public class Main {

	public static void main(String[] args) {
		PlayList playList=new PlayList();
		playList.addSong("Song1");
		playList.addSong("Song 1");
		playList.addSong("Song 2 Fav");
		playList.addSong("Song 3");
		playList.addSong("Song 4 Fav");
		playList.addSong("Song 5");
		PlaylistIterator iterator=playList.iterator("simple");
		System.out.println("Favourite playlist");
		PlaylistIterator favPlayList=playList.iterator("Favourite");
		while ((favPlayList.hasNext()))
		{
			System.out.println("Song : "+favPlayList.next());
		}
		System.out.println("Normal playlist");
		while(iterator.hasNext())
		{
			System.out.println("Song : "+iterator.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("Shuffle playlist");
		PlaylistIterator shufflList=playList.iterator("shuffled");
		while ((shufflList.hasNext()))
		{
			System.out.println("Song : "+shufflList.next());
		}
	}

}
