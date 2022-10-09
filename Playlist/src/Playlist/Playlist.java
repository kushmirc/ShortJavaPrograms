package Playlist;
import java.util.ArrayList;
public class Playlist {

    public static void main(String[] args) {
        //create playlist arraylist
        ArrayList<String> musicPlaylist = new ArrayList<String>();
        //add songs to playlist
        musicPlaylist.add("That's What Friends are For");
        musicPlaylist.add("Elderly Woman");
        musicPlaylist.add("The New Year");
        musicPlaylist.add("Love Like Rockets");
        musicPlaylist.add("Dear Prudence");
        musicPlaylist.add("Wings For Marie");
        musicPlaylist.add("Iin Desu Ka?");
        //display the playlist
        System.out.println(musicPlaylist);
        //display the number of songs in the playlist
        System.out.println(musicPlaylist.size());
        //remove a song by index, and display the new size
        musicPlaylist.remove(1);
        System.out.println(musicPlaylist.size());
        //remove a song by string, and display the new size
        musicPlaylist.remove("Wings For Marie");
        System.out.println(musicPlaylist.size());
        System.out.println(musicPlaylist);
        //declare variables to accomplish a song swap
        int indexA = musicPlaylist.indexOf("The New Year");
        int indexB = musicPlaylist.indexOf("Iin Desu Ka?");
        //overwrite the first song index with the title of the song to swap
        musicPlaylist.set(indexA,"Iin Desu Ka?");
        System.out.println(musicPlaylist);
        //overwrite the second song by setting declaring a new string to reference it
        String tempA = "The New Year";
        musicPlaylist.set(indexB, tempA);
        System.out.println(musicPlaylist);
    }
}
