import java.util.Scanner;
import java.io.*;
public class BasicFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("hello.txt");
        PrintWriter out = new PrintWriter("hello.txt");
        out.println("Hello, World");
        out.flush();
        out.close();

        Scanner sc = new Scanner(f);
        sc.hasNextLine();
        System.out.println(sc.nextLine());
        sc.close();
    }
}