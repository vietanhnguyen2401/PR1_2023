import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("abc", "jk", "def", "gh"));

        System.out.println("Original list: " + list);
        removeEvenLength(list);
        System.out.println("Output list: " + list);
    }

    public static void removeEvenLength(ArrayList<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            String s = iterator.previous();
            if (s.length() % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
