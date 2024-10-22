package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Give number ");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
        }
        nums.add(num);

        
    }
    System.out.println("From where: ");
        int start = scanner.nextInt();

        System.out.println("To where: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(nums.get(i));
        }
        // System.out.println("Write a number: ");
        // num = 0;
        // while(num != -1){
        //     Integer num = scanner.nextLine();
        //     nums.add(num);
        // }
        // System.out.println(nums);
    }
        
    // public static void main(String[] args) {
    //     ArrayList<String> friends = new ArrayList<>();

    //     System.out.println("Write a name: ");
    //     Scanner scanner = new Scanner(System.in);
    //     String name = scanner.nextLine();
    //    while(name != null || name != "") {

    //     friends.add(name);
    //     name = scanner.nextLine();
    //     // if(name.equals("")){
            
    //     // }
    //    }
        

        // System.out.println(friends.get(0));

            // public static void main(String[] args){
            //     ArrayList<Integer> ints = new ArrayList<>();

            //     Scanner scanner = new scanner(System.on);
            //     while(True){
            //         int input = Integer.valueOf(scanner.nextLine());
            //         if (input == 0){
            //             break;
            //         }
            //         if (input > 0 || input < 0){
            //             ints.add(input);
            //         }
            //     }
            //     int sum = 0;
            //     for (int i = 0; i < ints; i++) {
                    
            //     }

            // }







    }
        // public static void printStars(int number) {
        //     for (int i = 0; i < number; i++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // public static void printSquare(int number){
        //     for (int i = 0; i < number; i++) {
        //         printStars(number);
        //     }
        //     System.out.println();
        // }

        // public static void printRectangle(int width, int height){
        //     for (int i = 0; i < height; i++) {
        //         printStars(width);
        //     }
        // }
        
        // public static void printTriangle(int number){
        //     for (int i = 0; i < number; i++) {  m.l 
        //         printStars(i);
        //     }
        // }

        // // advanced astrology:

        // public static void printSpaces(int number){
        //     for (int i = 0; i < number; i++) {
        //         System.out.print(" ");
        //      }
        // }

        // public static void printTriangleTwo(int size){
        //     int j = 1;
        //     for (int i = size; j > 0; i--) {
        //         printSpaces(i);
        //         if(j < size+1){
        //             printStars(j);
        //             j++;
        //         }
        //     }
        // }

        // public static void printChristmasTree(int height){
        //     int j = 1;
        //     for (int i = height; i > 0; i--) {
        //         printSpaces(i);
        //         if (j < height * height) {
        //             printStars(j);
        //             j+=2;
        //         }
        //     }
        //     for (int i = 0; i < 2; i++) {
        //         printSpaces(j/2-1);
        //         printStars(3);
        //     }
        // }

        // public static void main(String[] args) {
        // // printStars(5);
        // // printStars(3);
        // // printStars(9);
        // // System.out.println("");
        // // printSquare(4);
        // // System.out.println("");
        // // printRectangle(17, 3);
        // // System.out.println("");
        // // printTriangle(5);
        // // System.out.println("");
        // // printTriangleTwo(3);
        // // System.out.println(4);
        //    printChristmasTree(50);
        //  }


    