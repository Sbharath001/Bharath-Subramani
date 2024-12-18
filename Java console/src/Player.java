import java.util.Scanner;

class Player {
    Scanner scan = new Scanner(System.in);
    
    public void play() {
        int number, select;
        Volume music = new Volume();
        music.id();
        
        Encapsulation password = new Encapsulation();
        password.get_password(); 
        
        MusicPlayer song_info = new MusicPlayer();
        song_info.add_song(1, "Maroon5", "Memories", Genre.POP);
        song_info.add_song(2, "Ava Max", "So Am I", Genre.JAZZ);
        song_info.add_song(3, "Led Zeppelin", "Stairway to Heaven", Genre.FOLK);
        song_info.add_song(4, "Lee Morgan", "Coera", Genre.JAZZ);
        song_info.add_song(5, "Benny Goodman", "Sing Sing Sing", Genre.JAZZ);
        song_info.add_song(6, "Billie Eilish", "Bad Guy", Genre.ROCK); 
        song_info.add_song(7, "Zayn", "Trampoline", Genre.FOLK); 
        song_info.add_song(8, "Ava Max", "King & Queen", Genre.POP);
        
        System.out.println("Type 1 for Play song");
        System.out.println("Type 2 for Pause song");
        System.out.println("Type 3 for Next song");
        System.out.println("Type 4 for Previous song");
        System.out.println("Type 5 for Volume Up");
        System.out.println("Type 6 for Volume Down");
        System.out.println("Type 7 for Song Queue");
        System.out.println("Type 8 to select a particular song");
        System.out.println("Type 9 for Stop and exit");
        
        song_info.playlist();
        
        for (int i = 0; i < 100; i++) {
            number = scan.nextInt();
            
            if (number == 1) {
                music.play(); 
                song_info.play_random_song(); 
            } else if (number == 2) {
                music.pause(); 
            } else if (number == 3) {
                music.next_song(); 
                song_info.play_random_song(); 
            } else if (number == 4) {
                music.previous_song(); 
                song_info.play_random_song();
            } else if (number == 5) {
                music.volume_up(); 
            } else if (number == 6) {
                music.volume_down(); 
            } else if (number == 7) {
                song_info.play_music_from_queue(); 
            } else if (number == 8) {
                System.out.println("Type the number to play a random song");
                select = scan.nextInt();
                song_info.play_song(select);
            } else if (number == 9) {
                music.exit(); 
                song_info.close_music_player(); 
                break;
            }
        }
    }
}
