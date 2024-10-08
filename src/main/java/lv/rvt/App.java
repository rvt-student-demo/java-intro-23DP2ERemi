package lv.rvt;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");
        printSquare(4);
        System.out.println("");
        printRectangle(17, 3);
        System.out.println("");
        printTriangle(5);
        }

        public static void printStars(int number) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        public static void printSquare(int number){
            for (int i = 0; i < number; i++) {
                printStars(number);
            }
            System.out.println();
        }

        public static void printRectangle(int width, int height){
            for (int i = 0; i < height; i++) {
                printStars(width);
            }
        }
        
        public static void printTriangle(int number){
            for (int i = 0; i < number; i++) {
                printStars(i);
            }
        }
}



    