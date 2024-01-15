import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayWithString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter some string: ");
        final String input = in.next();

        System.out.print("a) Uppercase characters: ");
        for(char c : input.toCharArray())
            if(Character.isUpperCase(c))
                System.out.print(c);
        System.out.println("");

        if(input.length() < 2)
            System.out.println("The string doesn't have a second character.");
        else
            System.out.println("b) Second character in string: " + input.charAt(1));

        final String inputVowels = input.replaceAll("[aeiou]", "\\_");
        System.out.println("c) Without vowels: " + inputVowels);

        System.out.println("d) Number of vowels: " + countOccurrencesRegex(input, Pattern.compile("[aeiou]")));

        System.out.println("e) Vowel positions: ");
        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) != '_' && inputVowels.charAt(i) == '_')
                System.out.println(" - Vowel " + input.charAt(i) + " is at position " + (i + 1));
    }

    public static int countOccurrencesRegex(String input, Pattern pattern) {
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }
}
