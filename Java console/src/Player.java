package bharath;

import java.util.Scanner;

class Player
{
	static Scanner scan = new Scanner(System.in);
	public void Play()
	{
		int Number,select;
		Volume music=new Volume();
		music.id();
		Encapsulation password = new Encapsulation();
		password.getpassword();
		
		MusicPlayer Songinfo=new MusicPlayer();
		Songinfo.addSong(1, "Maroon5","Memories",Genre.POP);
		Songinfo.addSong(2, "Ava max","So Am I",Genre.JAZZ);
		Songinfo.addSong(3, "Led Zeppelin","Stairway to Heaven",Genre.FOLK);
		Songinfo.addSong(4, "Lee Morgan", "Coera", Genre.JAZZ);
		Songinfo.addSong(5, "BennyGoodman","Sing Sing Sing",Genre.JAZZ);
		Songinfo.addSong(6, "Bille eilish","Bad Guy", Genre.ROCK);
		Songinfo.addSong(7, "zayn","Trampoline",Genre.FOLK);
		Songinfo.addSong(8, "Ava max","King & Queen",Genre.POP);
		System.out.println("Type 1 for Play song");
		System.out.println("Type 2 for Pause song");
		System.out.println("Type 3 for Next song");
		System.out.println("Type 4 for Privious song");
		System.out.println("Type 5 for VolumeUp");
		System.out.println("Type 6 for VolumeDown");
		System.out.println("Type 7 for Song Queue");
		System.out.println("Type 8 selcet particular song");
		System.out.println("Type 9 for Stop and exit");
		Songinfo.playlist();
		for(int i=0;i<100;i++)
		{
			Number=scan.nextInt();
			if(Number==1)
			{
				music.Play();
				Songinfo.playRandomSong();
			}
			else if (Number==2)
			{
				music.Pause();
			}
			else if(Number==3)
			{
				music.Nextsong();
				Songinfo.playRandomSong();
			}
			else if(Number==4)
			{
				music.Previoussong();
				Songinfo.playRandomSong();
			}
			else if(Number==5)
			{
				music.Volumeup();
			}
			else if(Number==6)
			{
				music.Volumedown();
			}
			else if(Number==7)
			{
				Songinfo.playMusicFromQueue();
			}
			else if(Number==8)
			{
				System.out.println("tpe the number to play random song");
				select=scan.nextInt();
				Songinfo.playSong(select);
			}
			else if(Number==9)
			{
				music.Exit();
				Songinfo.closeMusicPlayer();
				break;
			}
		}
	}
}
