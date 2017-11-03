
/**
 * Write a description of class iPod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  IPod {    
    private String name;
    private Song song;
    private Song[] songs = new Song[5];
    private int numSongs = 0;
    
    public IPod (String n)
    {
        name = n; 
    }
    
    public void addSong(String t, String a, int s, String f, int num)
    {
        song = new Song(t, a, s, f);
        songs[num] = song;
        numSongs++;
    }
    
    public void playSong(int num)
    {
        Mp3Player mp3 = new Mp3Player("C:/Users/john/Desktop/APCS/IPod/" + songs[num-1].getFileName());
        mp3.play();
    }
    
    public String getSong(int i){
        return songs[i].toString();
    }
    
    public String toString()
    {
        String t = name + "'s iPod\n";
        for(int i = 0; i < songs.length; i++){
            if(songs[i] != null)
                t += (i+1) + ".\t" + songs[i] + "\n";
        }   
        return t;
    }
}