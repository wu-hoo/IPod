
/**
 * Write a description of class IPodTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class IPodTest
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        IPod myPod = new IPod("Angelina");

        myPod.addSong("I want you back", "Jackson 5", 179, "I want you back.mp3", 0);
        myPod.addSong("Bohemian Rhapsody", "Queen", 179, "Bohemian Rhapsody.mp3", 1);
        myPod.addSong("You Should Be Dancing", "Bee Gees", 179, "You Should Be Dancing.mp3", 2);

        System.out.println(myPod);
        System.out.print("Which song do you want to play? ");
        int song = scan.nextInt();
        myPod.playSong(song);
        System.out.println("Playing " + myPod.getSong(song-1));
    }
}
