package bharath;

enum Genre
{
	POP,
	HIPHOP,
	JAZZ,
	FOLK,
	ROCK
}
class Song
{
	int songID;
	String singer;
	String song_name;
	Genre type;
	
	Song(int ID,String singer,String songname,Genre type)
	{
		this.songID=ID;
		this.singer=singer; 
		this.song_name=songname;
		this.type=type;
	}
}
