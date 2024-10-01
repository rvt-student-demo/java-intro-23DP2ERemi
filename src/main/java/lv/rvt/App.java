package lv.rvt;
import java.util.Scanner;

public class App 
{
    // public static void main(String[] args) {
    //     printUntilNumber(5);
    // }
    // public static void printUntilNumber(int num){
    //     for (int i = 1; i < num + 1; i++) {
    //         System.out.println(i);
    //     }
    // }


    public static void main(String[] args) {
        divisibleByThreeInRange(3, 100);
    }

    public static void divisibleByThreeInRange(int start, int end){
        for (int i = start; i < end + 1; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}



    