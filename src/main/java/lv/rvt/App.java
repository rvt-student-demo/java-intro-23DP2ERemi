package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());

        if (value >= 5000 & value < 25000){
            System.out.println("Tax: " + (100 + (value - 5000) * 0.08));
        }
        else if (value >= 25000 & value < 55000){
            System.out.println("Tax: " + (1700 + (value - 25000) * 0.1 ));
        }
        else if (value >= 55000 & value < 200000){
            System.out.println("Tax: " + (4700 + (value - 55000) * 0.12 ));
        }
        else if (value >= 200000 & value < 1000000){
            System.out.println("Tax: " + (22100 + (value - 200000) * 0.15 ));
        }
        else if (value >= 1000000){
            System.out.println("Tax: " + (142100 + (value - 1000000) * 0.17 ));
        }
        else{
            System.out.println("No tax!");
        }
        
    
    }
}


        // int num1 = Integer.valueOf(scanner.nextLine());
        // System.out.println("give second number:");
        // int num2 = Integer.valueOf(scanner.nextLine());

        // if (num1 > num2){
        //     System.out.println("Grater number is: " + num1);
        // }
        // else if (num2 > num1){
        //     System.out.println("Grater number is: " + num2);
        // }

        
        // // int num1 = Integer.valueOf(scanner.nextLine());
        // // int num2 = Integer.valueOf(scanner.nextLine());
        // // int num3 = Integer.valueOf(scanner.nextLine());

        // // int sum = num1 + num2 + num3;
        // // int mult =  num1 * num2 * num3;
        // // double avg = (num1 + num2 + num3) / 3.0;

        // // System.out.println("Sum: " + sum);
        // // System.out.println("multiplication: " + mult);
        // // System.out.println("average: " + avg);

        // // double value = Double.valueOf(""0,1);
        // // boolean value = Boolean.valueOf(scanner.nextLine());

        // // int calculationWithParentheses = 2 + 3 * 7;
        // // System.out.println(calculationWithParentheses); // prints 23
        
        // // int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        // // System.out.println(calculationWithoutParentheses); // prints 13
        

        // // Scanner scanner = new Scanner(System.in);

        // // System.out.println("give speed:");

        // // int speed = Integer.valueOf(scanner.nextLine());

        // // if (speed > 120){
        // //     System.out.println("Speed ticket!");
        // // }
        // // Scanner scanner = new Scanner(System.in);
        // // int atzime = Integer.valueOf(scanner.nextLine());
        // // if (atzime == 1){
        // //     System.out.println("slikti");
        // // }
        // // else if (atzime == 2){

        // }
    

   

