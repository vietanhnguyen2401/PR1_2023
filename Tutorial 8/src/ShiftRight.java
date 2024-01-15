import java.util.Arrays;

public class ShiftRight {
    public static void main(String[] args) {
        int[] array = {3, 8, 19, 7};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] shiftedArray = shiftRight(array);
        System.out.println("Shifted array: " + Arrays.toString(shiftedArray));
    }

    public static int[] shiftRight(int[] a) {
        int[] shiftedArray = new int[a.length];

        for (int i = 0; i < a.length - 1; i++) {
            shiftedArray[i + 1] = a[i];
        }

        shiftedArray[0] = a[a.length - 1];

        return shiftedArray;
    }
}
