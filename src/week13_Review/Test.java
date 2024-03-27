package week13_Review;

public class Test {
    public static void main(String[] args) {

        Song song1 = new Song("Enter Sandman", "Metallica", "Hard Rock", 1991);
        Song song2 = new Song("Shape of You", "Ed Sheeran", "Pop", 2017);
        Song song3 = new Song("Stairway to Heaven", "Led Zeppelin", "Rock", 1971);
        Song song4 = new Song("Hotel California","Michael Jackson","Pop Blues",1988);
        Song song5 = new Song("Scarlett","Doja Cat","Pop",2022);
        Song song6 = new Song("Valentine","Manaskin","Pop Rock",2023);
        Song song7 = new Song("Friends", "Madonna", "Pop Rock", 1985);
        Song song8 = new Song("Run","Chris Brown","HipHop",2004);
        Song song9 = new Song("Woman","Doja Cat","Pop",2021);
        Song song10 = new Song("Honey","Manaskin","Pop Rock",2022);
        Song song11 = new Song("Dirty","Xtina","Pop",2002);

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
        System.out.println(song4);
        System.out.println(song5);
        System.out.println(song6);
        System.out.println(song7);
        System.out.println(song8);
        System.out.println(song9);
        System.out.println(song10);
        System.out.println(song11);



        System.out.println("----------------------------------------------------------");

        PlayList playlist1 = new PlayList("Cydeo Music");

        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);

        playlist1.removeSong("Shape of You");

        System.out.println(playlist1);

        playlist1.displayPlayList();

        System.out.println("----------------------------------------------------------");

        PlayList playList2 = new PlayList("Gym Music");

        playList2.addSong(song4);
        playList2.addSong(song5);

        System.out.println("----------------------------------------------------------");

  MusicLibrary musicLibrary = new MusicLibrary();

  musicLibrary.addPlayList(playlist1);
  musicLibrary.addPlayList(playList2);

  musicLibrary.getPlayList("Cydeo Music").addSong(song2);
//  musicLibrary.getPlayList().get(1).getSong().put(song6.getTitle().toLowerCase(), song6);
        musicLibrary.getPlayList("Gym Music").addSong(song6);
        System.out.println(musicLibrary);
        musicLibrary.displayMusicLibrary();









    }
}
