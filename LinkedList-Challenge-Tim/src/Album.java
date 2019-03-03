import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Songs>songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public boolean addSongs(String title,int duration){
        if(findSongs(title )==null){
            this.songs.add(new Songs(title,duration));
            return true;

        }
        return false;
    }

    private Songs findSongs(String title){
        for(Songs checkedsong:this.songs){
            if(checkedsong.getTitle().equals(title)){
                return checkedsong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Songs>playList){
        int index = trackNumber-1;
        if((index>=0)&&(index<=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This has no track Number : "+trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title,LinkedList<Songs>playList){
        Songs checkedSongs = findSongs(title);
        if(checkedSongs!=null){
            playList.add(checkedSongs);
            return true;
        }
        System.out.println("No track "+title+" is found!");
        return false;
    }
}
