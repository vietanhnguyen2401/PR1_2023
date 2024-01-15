import java.util.*;
import java.io.*;
public class Activity3 {
    public static void main(String[] args){
        System.out.println("Words without duplicate");
        try{
            Scanner in = new Scanner(new File("mary.txt"));
            Set<String> set = new HashSet<String>();
            while(in.hasNextLine()){
                String line = in.nextLine();
                String[] words = line.split(" ");
                for (String word: words){
                    set.add(word.toLowerCase(Locale.ROOT));
                }
            }
            System.out.println(set);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
