import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static LinkedList<Song> playList;
    private static ArrayList<Album> albums;

    public static void main(String[] args) {
        Album one = new Album("Test1", "Kevin");
        one.addSong("Hello", 3.2);
        one.addSong("World", 4.2);
        one.addSong("Goodbye", 3.6);

        Album two = new Album("Test2", "Bowie");
        two.addSong("Love", 444444.1);
        two.addSong("You", 21.1);
        two.addSong("Stinky", 5.5);

        playList = new LinkedList<Song>();
        albums = new ArrayList<Album>();
        albums.add(one);
        albums.add(two);
        albums.get(0).addSongToPlaylist(playList, "Hello");
        albums.get(0).addSongToPlaylist(playList, "Goodbye");
        albums.get(1).addSongToPlaylist(playList, "Stinky");
        albums.get(1).addSongToPlaylist(playList, 0, "Love");
        albums.get(1).addSongToPlaylist(playList, "You");
        play(playList);
    }
    
    public static void play(LinkedList<Song> playList){
        if(playList.size() <= 0){
            System.out.println("No songs to play");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        int option;
        ListIterator<Song> songs = playList.listIterator();
        printMenu();
        System.out.println("Now playing " + songs.next().toString());
        while(!quit){
            System.out.print("What do you want to do next? ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                //play next
                case 0:

                    if(!forward){
                        if(songs.hasNext()){
                            songs.next();
                        }
                        forward = true;
                    }
                    if(songs.hasNext()) {
                        System.out.println("Now playing " + songs.next().toString());
                    }
                    else{
                        System.out.println("You have reached the end of the play list");
                    }
                    break;
                //play prev.
                case 1:
                    if(forward){
                        if(songs.hasPrevious()){
                            songs.previous();
                        }
                        forward = false;
                    }
                    if(songs.hasPrevious()){
                        System.out.println("Now playing " + songs.previous().toString());
                    }
                    else{
                        System.out.println("You've reached the beginning of the playlist");
                    }

                    break;
                case 2:
                   if(forward){
                       if(songs.hasPrevious()){
                           System.out.println("Now playing " + songs.previous().toString());
                           songs.next();
                       }
                   }
                   else{
                       if(songs.hasNext()){
                           System.out.println("Now playing " + songs.next().toString());
                           songs.previous();
                       }
                   }

                    break;
                case 3:
                    printPlaylist(playList);
                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    if(playList.size() > 0) {
                        songs.remove();
                        if(songs.hasNext()) {
                            System.out.println("Now playing " + songs.next().toString());
                        }
                        else{
                            System.out.println("Now playing " + songs.previous().toString());
                        }
                    }
                    break;
                case 6:
                   quit = true;
                    break;
            }
        }
    }
    
    public static void printMenu(){
        System.out.println("Enter 0 to play the next song,");
        System.out.println("Enter 1 to play the previous song,");
        System.out.println("Enter 2 to replay the current song,");
        System.out.println("Enter 3 to list the songs in the playlist, ");
        System.out.println("Enter 4 to print the options,");
        System.out.println("Enter 5 to remove the current song.");
        System.out.println("Enter 6 to exit the program.");
    }

    private static void printPlaylist(LinkedList<Song> playList){
        ListIterator<Song> songs = playList.listIterator();
        while(songs.hasNext()){
            System.out.println(songs.next().toString());
        }
    }
}
