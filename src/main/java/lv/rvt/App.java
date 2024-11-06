package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("pauls balance: " + paulsCard);
        System.out.println("matts balance: " + mattsCard);

        paulsCard.addMoney(20);

        mattsCard.eatHeartily();
        System.out.println("pauls balance: " + paulsCard);
        System.out.println("matts balance: " + mattsCard);
        
        paulsCard.eatAffordably();
        mattsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("pauls balance: " + paulsCard);
        System.out.println("matts balance: " + mattsCard);
    }
}