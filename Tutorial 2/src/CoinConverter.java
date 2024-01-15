public class CoinConverter {
    public static void main(String[] args) {
        int money=483274;
        int quan=money/10000;
        int dong=(money%10000)/100;
        int hao=(money%100)/10;
        int xu=money%10;
        System.out.println(money+" xu convert into: ");
        System.out.println(quan+" quan, "+dong+" dong, "+hao+" hao, "+xu+" xu.");
    }
}
