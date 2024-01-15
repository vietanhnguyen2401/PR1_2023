import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args){
        int[] arr = {16,5,9,12,36};
        int result = binarySearch(arr,9,0,4);
        System.out.println("Element is found in the array: "+result);
    }
    public static int binarySearch(int[] arr, int key, int low, int high){
        if(high>=low){
            int mid = low +(high -low)/2;
            if(arr[mid]==key) {
                return mid;
            }
            else if (arr[mid]>key) {
                return binarySearch(arr, key, low, mid - 1);
            }
            else {
                return binarySearch(arr, key, mid + 1, high);
            }
        }else {
            return -1;
        }
    }
}
