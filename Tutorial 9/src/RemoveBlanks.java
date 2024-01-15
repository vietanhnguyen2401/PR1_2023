import java.io.IOException;
import java.util.*;
import java.io.*;
public class RemoveBlanks {
    public static void main(String[] args) throws IOException {
        try {
            File fileIn = new File("input.txt");
            PrintWriter fileOut;
            try (Scanner input = new Scanner(fileIn)){
                fileOut = new PrintWriter("output.txt");
                while (input.hasNextLine()){
                    String message = input.nextLine();
                    if (!message.isEmpty()){
                        fileOut.println(message);
                    }
                }
            }
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
