import java.util.*;
public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in your array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        int[] b = selectionSort(a);
        for (int num : b){
            System.out.print(num + " ");
        }
    }
    public static int[] selectionSort(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[p]) {
                    p = j;
                }
                b[i] = a[p];
                a[p] = a[i];

        }
        return b;
    }
}
