package bharath;

enum Genre
{
	POP,
	HIPHOP,
	JAZZ,
	FOLK,
	ROCK
}package bharath;

enum Genre {
    POP,
    HIPHOP,
    JAZZ,
    FOLK,
    ROCK
}

class Song {
    int song_id;       
    String singer;
    String song_name;      
    Genre type;

    Song(int id, String singer, String song_name, Genre type) {
        this.song_id = id; 
        this.singer = singer;
        this.song_name = song_name;
        this.type = type;
    }
}

class Song
{
	int song_iD;
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
