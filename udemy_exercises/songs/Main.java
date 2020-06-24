package udemy_exercises.songs;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("This Time I''m Swingin'", "Dean Martin");
        album.addSong("I Can't Believe That You're In Love With Me", 2.25);
        album.addSong("True Love", 2.33);
        album.addSong("You're nobody 'Til Somebody Loves You", 2.14);
        album.addSong("On The Street Where You Live", 3.41);
        album.addSong("Imagination", 3.15);
        albums.add(album);

        album = new Album("Come Fly With Me", "Frank Sinatra");
        album.addSong("Come Fly With Me", 3.19);
        album.addSong("Around The World", 3.21);
        album.addSong("Isle Of Capri", 2.29);
        album.addSong("Moonlight In Vermont", 3.33);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You're nobody 'Til Somebody Loves You", playlist);
        albums.get(0).addToPlaylist("On The Street Where You Live", playlist);
        albums.get(0).addToPlaylist("Ain't That A Kick In The Head", playlist);
        albums.get(1).addToPlaylist("Come Fly With Me", playlist);
        albums.get(1).addToPlaylist("Moonlight In Vermont", playlist);
        albums.get(1).addToPlaylist(7, playlist);

        play(playlist);

    }


    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("Empty playlist!");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("You have reached the end of your playlist!");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        //listIterator.previous();
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Error going to previous song: You are at the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are on the first song in the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0 ) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing  " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Select an option:\nenter");
        System.out.println("0 - to quit\n" +
                "1 - to skip to next song\n" +
                "2 - to return to previous song\n" +
                "3 - to replay current song\n" +
                "4 - show playlist\n" +
                "5 - Show menu options.\n" +
                "6 - Delete current song from playlist.");
    }

    //in this method the iterator only iterates once. perfect for what we are using it for! Note! Look at this later, fogged,
    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("====================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====================");
    }




}











