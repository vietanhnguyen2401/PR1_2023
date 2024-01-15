import java.util.*;
import java.io.*;
public class Activity3 {
    public static void main (String[] args) {
       try {
           File file = new File("data.bin");
           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);
           ArrayList<String> list = (ArrayList<String>)ois.readObject();
           for (int i=0; i< list.size(); i++){
               System.out.println(list.get(i));
           }
           ois.close();
       } catch(FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }
    }
}
