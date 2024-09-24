package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int end = 101;
            for (int i = num + 1; i < end; i ++ ){
                System.out.println(i);
            }
    }
}


    