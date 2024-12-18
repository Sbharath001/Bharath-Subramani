package bharath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class MusicPlayer {
    ArrayList<Song> music_list;
    Queue<Song> music_q;
    int total_song_count;
    Random rand;

    MusicPlayer() {
        System.out.println("<<<<<< Initialize Music Player >>>>>>");
        music_list = new ArrayList<Song>();
        rand = new Random();
        music_q = new LinkedList<Song>();
        total_song_count = 0;
    }

    void add_song(int id, String singer, String song_name, Genre type) {
        music_list.add(total_song_count, new Song(id, singer, song_name, type));
        total_song_count++;
    }

    void playlist() {
        System.out.println("Songs List- [");
        for (int count = 0; count < total_song_count; count++) {
            Song song = music_list.get(count);
            System.out.println(song.song_name + ", ");
        }
        System.out.println("]");
    }

    void play_random_song() {
        int rand_int = rand.nextInt(total_song_count);
        Song playing_song = music_list.remove(rand_int);
        total_song_count--;
        music_q.add(playing_song);
        System.out.println("The song: " + playing_song.song_name + " is playing");
        music_list.add(playing_song);
    }

    void play_song(int id) {
        for (int count = 0; count < total_song_count; count++) {
            Song x = music_list.get(count);
            if (x.songID == id) {
                music_list.remove(count);
                total_song_count--;
                System.out.println("The song: " + x.song_name + " is currently playing.");
                music_list.add(x);
                return;
            }
        }

        for (int count = total_song_count; count < music_list.size(); count++) {
            Song x = music_list.get(count);
            if (x.songID == id) {
                System.out.println("The song: " + x.song_name + " is currently playing.");
            }
        }
    }

    void close_music_player() {
        System.out.println("<<<<<< Closing Music Player >>>>>>");
        music_q.clear();
        total_song_count = music_list.size();
    }

    void play_music_from_queue() {
        System.out.print("The current queue contains: [ ");
        for (Song song : music_q) {
            System.out.println(song.song_name + " ");
        }
        System.out.println("]");
    }
}
