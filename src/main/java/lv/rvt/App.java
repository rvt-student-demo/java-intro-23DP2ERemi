package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("enter a number: ");
        // int num = Integer.valueOf(scanner.nextLine());
        // int end = 101;
        //     for (int i = num + 1; i < end; i ++ ){
        //         System.out.println(i);
        //     }

        Scanner scanner = new Scanner(System.in);
        System.out.println("give number: ");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            sum = sum + num;
            count = count + 1;
            avg = sum / count;
            if (num % 2 != 0){
                odd ++;
            }
            if (num % 2 == 0){
                even ++;
            }
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("sum is: " + sum);
        System.out.println("numbers: " + count);
        System.out.println("average: " + avg);
        System.out.println("even numbers: " + even);
        System.out.println("odd numbers: " + odd);
        }
}


    