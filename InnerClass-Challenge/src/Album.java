import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSongs(String title,int duration){
        return this.songs.addSongs(new Songs(title,duration));
    }

    private Songs findSongs(String title){
        for(Songs checkedsong:this.songs.songs){
            if(checkedsong.getTitle().equals(title)){
                return checkedsong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Songs>playList){
        Songs checkedSong = this.songs.findSongs(trackNumber);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title,LinkedList<Songs>playList){
        Songs checkedSongs = this.songs.findSongs(title);
        if(checkedSongs!=null){
            playList.add(checkedSongs);
            return true;
        }
        System.out.println("No track "+title+" is found!");
        return false;
    }
    public class SongList{
        private ArrayList<Songs>songs;
        public SongList(){
            this.songs=new ArrayList<>();
        }

        public boolean addSongs(Songs song){
            if(songs.contains(song))
                return false;
            else{
                songs.add(song);
                return true;
            }
        }

        private Songs findSongs(String title){
            for(Songs checkedsong:this.songs){
                if(checkedsong.getTitle().equals(title)){
                    return checkedsong;
                }
            }
            return null;
        }

        private Songs findSongs(int trackNumber){
            int index = trackNumber-1;
            if((index>0) && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }
    }
}
