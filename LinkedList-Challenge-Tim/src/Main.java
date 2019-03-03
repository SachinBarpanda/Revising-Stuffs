import java.util.*;

public class Main {
    private static ArrayList<Album>albums=new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Divide","Ed-Sheeran");
        album.addSongs("Shape of you",5);
        album.addSongs("Castle on the hill",6);
        album.addSongs("Perfect",5);
        albums.add(album);

        Album album1= new Album("Illuminate","Shawn Mendes");
        album1.addSongs("Little do you know",4);
        album1.addSongs("Stiches",5);
        album1.addSongs("Mercy",5);
        albums.add(album1);

        LinkedList<Songs> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("Shape of you",playlist);
        albums.get(0).addToPlaylist("Perfect",playlist);
        albums.get(0).addToPlaylist("Man",playlist);
        albums.get(1).addToPlaylist(1,playlist);
        albums.get(1).addToPlaylist(3,playlist);
        albums.get(1).addToPlaylist(7,playlist);

        play(playlist);

    }
    public static void play(LinkedList<Songs>playSongs){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Songs>listIterator= playSongs.listIterator();
        if(playSongs.size()==0){
            System.out.println("Please add songs before playing!");
        }
        else {
            System.out.println("Now Playing : " + listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            System.out.println("Enter your choice : ");
            int number  = sc.nextInt();
            sc.nextLine();
            switch (number){
                case 0:
                    System.out.println("Exiting player");
                    quit= true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing : "+listIterator.next().toString());
                    }else {
                        System.out.println("Reached to the end of Playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing : "+listIterator.previous().toString());
                    }else {
                        System.out.println("Reached to the start of the Playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Playing again : "+listIterator.previous().toString());
                            forward=false;
                        }
                        else {
                            System.out.println("We are at the start of the Playlist");
                        }
                    }
                    else{
                        if(listIterator.hasNext()){
                            System.out.println("Playing again : "+ listIterator.next().toString());
                            forward=true;
                        }
                        else {
                            System.out.println("we are at the end of the Playlist");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Available songs in the Playlist");
                    printList(playSongs);
                    break;


                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playSongs.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing : "+listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing  : "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Available :");
        System.out.println( "0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions\n"+
                "6 - remove the current song");
    }

    private static void printList(LinkedList<Songs>playlist){
        Iterator<Songs>iterator = playlist.iterator();
        int i=1;
        while(iterator.hasNext()){
            System.out.println(i+" :"+iterator.next().toString());
            i++;
        }
    }
}
