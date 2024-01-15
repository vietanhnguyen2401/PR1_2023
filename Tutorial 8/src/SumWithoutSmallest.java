public class SumWithoutSmallest {
    public static void main(String[] args) {
        SumWithoutSmallest app = new SumWithoutSmallest();
        int [] number ={1,3,5,7,9};
        int sum =app.sumWithoutSmallest(number);
        System.out.println("The sum without smallest: "+sum);
    }
    public static int sumWithoutSmallest(int[] numbers) {
        int min = numbers[0];
        int sum = min;
        for (int i =1;i < numbers.length; i++) {
            sum+=numbers[i];
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        return sum - min;
    }
}
