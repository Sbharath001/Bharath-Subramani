package bharath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class MusicPlayer 
{	
	ArrayList<Song> musiclist;
	Queue<Song> musicQ;
	int total_Song_Count;
	Random rand;
	
	MusicPlayer()
	{
		System.out.println("<<<<<< Initialize Music Player >>>>>>");
		musiclist=new ArrayList<Song>();
		rand = new Random();
		musicQ=new LinkedList<Song>();
		total_Song_Count=0;
	}
	
	void addSong(int ID,String singer,String songname,Genre type)
	{
		musiclist.add(total_Song_Count,new Song(ID,singer,songname,type));
		total_Song_Count++;
	}
	void playlist() {
		System.out.println("Songs List-[");
		for(int count=0;count<total_Song_Count;count++) {
			Song song=(Song)musiclist.get(count);
			System.out.println(song.song_name+", ");
		}
		System.out.println("]");
	}
	
	void playRandomSong()
	{
		int rand_int = rand.nextInt(total_Song_Count); 
		Song playingSong=musiclist.remove(rand_int);
		total_Song_Count--;
		musicQ.add(playingSong);
		System.out.println("The song : "+playingSong.song_name+" is playing");
		musiclist.add(playingSong);
	}
	
	void playSong(int ID)
	{
		for(int count=0;count<total_Song_Count;count++)
		{
			Song x=(Song)musiclist.get(count);
			if(x.songID==ID)
			{
				musiclist.remove(count);
				total_Song_Count--;
				System.out.println("The song : "+x.song_name+" is currently playing.");
				musiclist.add(x);
				return;
			}
		}
		
		for(int count=total_Song_Count;count<musiclist.size();count++)
		{
			Song x=(Song)musiclist.get(count);
			if(x.songID==ID)
			{
					System.out.println("The song : "+x.song_name+" is currently playing.");
			}
		}
		return;
	}
	void closeMusicPlayer()
	{
		System.out.println("<<<<<< Closing Music Player >>>>>>");
		musicQ.clear();
		total_Song_Count=musiclist.size();
	}
	
	void playMusicFromQueue()
	{
		System.out.print("The current queue contains : [ ");
		for(Song song:musicQ)
		{
			System.out.println(song.song_name+" ");
		}
		System.out.println("]");
	}
	
}
	