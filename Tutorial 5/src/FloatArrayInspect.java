import java.util.Scanner;
public class FloatArrayInspect {
    public static void main (String[] args){
        double [] number = getNumber();
        double average = calAverage(number);
        System.out.println("Average value: " + average);
        double min = getMin(number);
        System.out.println("Minimum value: " + min);
        double max= getMax(number);
        System.out.println("Maximum value: " + max);
        double range= Math.abs(max-min);
        System.out.println("Range of the values: " + range);
    }

    //enter value
    public static double[] getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value number " + i+": ");
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    //average
    public static double calAverage(double[] m){
        double sum = 0;
        for(int i =0; i<m.length;i++){
            sum=m[i]+sum;
        }
        return sum/(m.length);
    }

    //find minimum number
    public static double getMin(double[] array) {
        double minNum = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }

    //find maximum number
    public static double getMax(double[] array) {
        double maxNum = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }
}
