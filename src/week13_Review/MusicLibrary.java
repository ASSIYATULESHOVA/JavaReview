package week13_Review;

import java.util.LinkedList;
import java.util.List;

public class MusicLibrary {

    private List<PlayList> playLists = new LinkedList<>();

    public List<PlayList> getPlayListLists() {
        return playLists;
    }

    private int count;

    public List<PlayList> getPlayLists() {
        return playLists;
    }

    public void setPlayLists(List<PlayList> playLists) {
        this.playLists = playLists;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addPlayList(PlayList playList){
        if(playList == null){
            throw new NullPointerException("Null can not be added to the music library");
        }

        if(playList.getSongs().isEmpty()){
            throw new RuntimeException("Empty playlist can not be added to the music library");
        }

        if(count == 10){
            throw new RuntimeException("Maximum number of playlists tha music library can have is 10");
        }
        playLists.add(playList);
        count++;
    } // ADD

    public void removePlayList(String playlistName){
       if ( playLists.removeIf( p -> p.getName().equalsIgnoreCase(playlistName))){
            count--;
        }


    }  // REMOVE

    public PlayList getPlayList(String playlistName){
        for (PlayList playList : playLists) {
            if(playList.getName().equalsIgnoreCase(playlistName)){
                return playList;
            }
        }
        throw new RuntimeException("The playlist \"" +playlistName +"\" does not exist");
    }

    public void displayMusicLibrary(){
        if(playLists.isEmpty()){
            System.out.println("Music library is empty");
            return;
        }

        for (PlayList playList : playLists) {
            playList.displayPlayList();
        }
    }


    public String toString() {
        return "MusicLibrary{" +
                "Total number of playLists= " + playLists.size() +
                '}';
    }
}
