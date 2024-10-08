package lv.rvt;

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
        System.out.println("");
        printTriangleTwo(3);
        System.out.println(4);
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

        // advanced astrology:

        public static void printSpaces(int number){
            for (int i = 0; i < number; i++) {
                System.out.print(" ");
             }
        }

        public static void printTriangleTwo(int size){
            int j = 1;
            for (int i = size; j > 0; i--) {
                printSpaces(i);
                if(j < size+1){
                    printStars(j);
                    j++;
                }
            }
        }

        public static void printChristmasTree(int height){
            for (int i = 1; i < height*height; i+=2) {
                printStars(i);
            }
            int j = 1;
            for (int i = height; i > 0; i--) {
                printSpaces(i);
                if(j < height*height){
                    printStars(j);
                    j+=2;
                }
            }
            for (int i = 0; i < 2; i++) {
                printSpaces(j/2-1);
                printStars(3);
            }
            }
}



    