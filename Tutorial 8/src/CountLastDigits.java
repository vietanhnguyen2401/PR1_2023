import java.util.Arrays;
public class CountLastDigits {
    public static void main (String[]args){
        int[] list = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        int[] count = new int[10];
        countLastDigits(list, count);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(count));
    }

    private static void countLastDigits(int[] list, int[] count) {

    }
}
