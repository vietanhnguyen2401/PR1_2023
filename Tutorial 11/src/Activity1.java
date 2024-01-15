import java.util.*;
public class Activity1 {
    public static void main(String[] args) {
        int option;
        do {
            HashMap<String, String> dict = new HashMap<>();
            dict.put("hello", "xin chào");
            dict.put("goodbye", "tạm biệt");
            dict.put("dog", "con chó");
            dict.put("cat", "con mèo");
            dict.put("blue", "màu xanh nước biển");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any English words: ");
            String word = sc.nextLine();
            // check
            if (dict.containsKey(word)) {
                String meaning = dict.get(word);
                System.out.println("The meaning of the word in Vietnamese is: ");
                System.out.println(meaning);
            } else {
                System.out.println("Meaning not found");
            }
            // if continue
            System.out.println("\nDo you want to look up another word? (Enter 1 is Yes / 2 is No)");
            option = sc.nextInt();
            if (option == 2) {
                System.out.println("Goodbye! Thanks for searching");
            }
        } while (option == 1);
    }
}
