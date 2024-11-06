package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        statistics statistics = new statistics();
        statistics evenNumbers = new statistics();
        statistics oddNumbers = new statistics();


        while (true){
            int number = Integer.valueOf(input.nextLine());
            if (number <= -1){
                break;
            }
            statistics.addNumber(number);
            if (number % 2 == 0){
                evenNumbers.addNumber(number);
            } else{
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("Count: " + statistics.getCount() + " Sum: " + statistics.Sum() + " Avg: " + statistics.getAvg() + " Even number sum: " + evenNumbers.Sum() + " Odd number sum: " + oddNumbers.Sum() );
    }
}