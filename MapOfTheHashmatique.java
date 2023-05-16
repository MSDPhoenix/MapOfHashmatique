import java.util.Set;
import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void main(String[] args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Hotel California","On a dark desert highway\nCool wind in my hair\nWarm smell of colitas\nRising up through the air\nUp ahead in the distance\nMy head grew heavy and my sight grew dim\nI had to stop for the night");
        trackList.put("Freebird","If I leave here tomorrow\nWould you still remember me?\nFor I must be traveling on now\n'Cause there's too many places I've got to see\nBut if I stay here with you, girl\nThings just couldn't be the same\n'Cause I'm as free as a bird now\nAnd this bird you cannot change\nOh, oh, oh, oh\nAnd the bird you cannot change\nAnd this bird, you cannot change\nLord knows, I can't change");
        trackList.put("Thriller","It's close to midnight\nAnd something evil's lurking in the dark\nUnder the moonlight\nYou see a sight that almost stops your heart\nYou try to scream\nBut terror takes the sound before you make it\nYou start to freeze\nAs horror looks you right between the eyes\nYou're paralyzed");
        trackList.put("Imagine",
                                "Imagine there's no heaven"+
                                "\nIt's easy if you try"+
                                "\nNo hell below us"+
                                "\nAbove us, only sky"+
                                "\nImagine all the people"+
                                "\nLivin' for today"+
                                "\nAh");
        trackList.put("Don't Fear the Reaper",
                                "All our times have come"+
                                "\nHere but now they're gone"+
                                "\nSeasons don't fear the reaper"+
                                "\nNor do the wind, the sun or the rain"+
                                "\nWe can be like they are"+
                                "\nCome on, baby (don't fear the reaper)"+
                                "\nBaby, take my hand (don't fear the reaper)"+
                                "\nWe'll be able to fly (don't fear the reaper)"+
                                "\nBaby, I'm your man");
        Set<String> trackTitles = trackList.keySet();
        for(String title:trackTitles){
            System.out.println("\n"+title+":\n\n"+trackList.get(title)+"\n");
        }
    }   
}
