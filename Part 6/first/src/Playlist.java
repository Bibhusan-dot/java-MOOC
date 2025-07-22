import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;

    public
    Playlist(){
        this.songs = new ArrayList<>();
    }
    void addSongs(String song){
        this.songs.add(song);
    }

    void removeSong(String song){
        this.songs.remove(song);
    }

    void display(){
        System.out.println("Playlist:\n");
        for(String s:songs){
            System.out.println(s);
        }
    }
}
