import java.util.Scanner;
import java.io.*;
public class LineNumbers {
    public static void main(String[] args)  {
        try {
            FileReader inFile = new FileReader("mary.txt");
            Scanner scan = new Scanner(inFile);
            PrintWriter outFile = new PrintWriter("mary2.txt");
            int count = 1;
            while (scan.hasNextLine())  {
                String lines = scan.nextLine();
                outFile.println("/* " + count + " */ " + lines);
                count++;
            }
            outFile.close();
        }
        catch (IOException e)  {
            System.out.println("Error processing file: " + e);
        }
    }
}
