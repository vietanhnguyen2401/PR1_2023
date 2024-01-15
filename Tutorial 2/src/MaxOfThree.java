public class MaxOfThree {
    public static void main(String[] args) {
        int a= 4,b= 2, c= 10;
        int max =a;
        if (a<b){
             max = b;
        }if (b<c){
            max =c;
        }
        System.out.println("Among "+a+", "+b+" and "+c+", the largest is "+max+".");
    }
}
