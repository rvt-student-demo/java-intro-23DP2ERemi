package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Value of the gift?");
        // int value = Integer.valueOf(scanner.nextLine());

        // if (value >= 5000 & value < 25000){
        //     System.out.println("Tax: " + (100 + (value - 5000) * 0.08));
        // }
        // else if (value >= 25000 & value < 55000){
        //     System.out.println("Tax: " + (1700 + (value - 25000) * 0.1 ));
        // }
        // else if (value >= 55000 & value < 200000){
        //     System.out.println("Tax: " + (4700 + (value - 55000) * 0.12 ));
        // }
        // else if (value >= 200000 & value < 1000000){
        //     System.out.println("Tax: " + (22100 + (value - 200000) * 0.15 ));
        // }
        // else if (value >= 1000000){
        //     System.out.println("Tax: " + (142100 + (value - 1000000) * 0.17 ));
        // }
        // else{
        //     System.out.println("No tax!");
        // }
        
       
        // while (num != 0){
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("gve number");
        //     int num = Integer.valueOf(scanner.nextLine());
            
        // }

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int amount = 0;

        while (true) {
             System.out.println("Give a number (0 to stop): ");
             int num = Integer.valueOf(reader.nextLine());

            sum = sum + num;
            
                if (num == 0){
                    amount = amount + 1;
                }

                if (num == 0) {

                    break;
                }
        
    }
    System.out.println("sum: " + sum);
    System.out.println("amount: " + amount);
}

}   

   

