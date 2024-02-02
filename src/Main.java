public class Main
{
    public static void main(String[] args) {
        double cardBalance = 5000;
        final double INTREST_RATE = 1.17;
       cardBalance = cardBalance * INTREST_RATE;
        System.out.println("The card balance due after one month is: " + cardBalance);
        cardBalance = cardBalance * INTREST_RATE;
        System.out.println("The card balance due after two months is: " + cardBalance);



    }
}