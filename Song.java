/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song
{
    private String title, artist, modSecs, fileName;
    private int length, mins, secs;

    /**
     * Constructor for objects of class Song
     */
    public Song(String t, String a, int l, String f)
    {
        title = t;
        artist = a;
        length = l;
        fileName = f;
        mins = length/60;
        secs = length%60;
    }

    public String getTitle()
    {
        return "Title: " + title;
    }
    
    public String getArtist()
    {
        return "Artist: " + artist;
    }
    
    public String getLength()
    {
        mins = length/60;
        secs = length%60;
        if (secs < 10)
        {
            modSecs = "0" + secs;
            return "Length: " + mins + ":" + modSecs;
        }
        else
            return "Length: " + mins + ":" + secs;
    }
    
    public String getFileName()
    {
        return fileName;
    }
    
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    
     public void setLength(int newLength)
    {       
        length = newLength;
        mins = length/60;
        secs = length%60;
    }
    
     public void setArtist(String newArtist)
    {
        artist = newArtist;
    }
        
    public String toString()
    {
        return title + "  |  " + artist + "  |  " + mins + ":" + secs + "\n";
    }
}
