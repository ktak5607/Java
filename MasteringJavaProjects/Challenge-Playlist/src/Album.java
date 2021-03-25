import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private ArrayList<Song> songs;
    private String name;
    private String artist;

    public Album(String name, String artist){
        songs =  new ArrayList<Song>();
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    private Song findSong(String songTitle){
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).getTitle().equals(songTitle)){
                return songs.get(i);
            }
        }
        return null;
    }
    public void addSong(String title, double duration){
        Song song = findSong(title);
        if(song == null){
            songs.add(new Song(title, duration));
            System.out.println("Added " + title + " to " + this.name);
        }
        else{
            System.out.println(title + " is already on " + this.name);
        }
    }
    public void addSongToPlaylist(LinkedList<Song> playlist, String songTitle){
        Song song = findSong(songTitle);
        if(song != null){
            playlist.add(song);
        }
        else{
            System.out.println("Failed to find " + songTitle + " on " + this.name);
        }
    }
    public void addSongToPlaylist(LinkedList<Song> playlist, int position, String songTitle){
        Song song = findSong(songTitle);
        if(song != null){
            playlist.add(position, song);
        }
        else{
            System.out.println("Failed to find " + songTitle + " on " + this.name);
        }
    }
    public boolean removeSongFromPlaylist(LinkedList<Song> playlist, String songTitle){
        ListIterator<Song> playListIterator = playlist.listIterator();
        while (playListIterator.hasNext()) {
            Song song = playListIterator.next();
            if (song.getTitle().equals(songTitle)) {
                playListIterator.remove();
                return true;
            }
        }
        return false;
    }
    public void printSongs(){
        for (int i = 0; i < songs.size(); i++){
            System.out.println(songs.get(i).toString());
        }
    }




}
