import java.io.*;
import java.util.ArrayList;
public class Activity2 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello world");
        list.add("goodbye world");
        try{
            File file= new File("data.bin");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
