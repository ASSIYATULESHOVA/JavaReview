package week13_Review;

import java.util.LinkedHashMap;
import java.util.Map;

public class PlayList {
    private String name;
    private Map<String, Song> songs;
    public Map<String, Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        if(song == null ){
            throw new NullPointerException("Song can not be null, null is not accepted");
        }
        songs.put(song.getTitle().toLowerCase(),song);
    } //ADD SONG

    public void removeSong(String title){
        title = title.toLowerCase();
        if(!songs.containsKey(title)){
            throw new RuntimeException("The song "+ title+" not found");
        }
        songs.remove(title);


    } // REMOVE SONG

    public void displayPlayList(){
        if(songs.isEmpty()){
            System.out.println("Playlist is empty");
            return;
        }
        System.out.println("Playlist: "+ getName());
        for (Song value : songs.values()) {
            System.out.println("\t"+value);
        }
    }

    private int count;

    public String toString() {
        return "PlayList{" +
                "name = " + name + '\'' +
                ", Total number of songs = " + songs.size() +
                '}';
    }

    public PlayList(String name) {
      setName(name);
        songs = new LinkedHashMap<>();
    }  // CONSTRACTOR

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
