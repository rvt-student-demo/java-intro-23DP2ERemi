package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kā tevi sauc?");
        String name = scanner.nextLine();
        System.out.println("Ievadi savu uzvardi:");
        String surname = scanner.nextLine();
        System.out.println("kurā grupa tu esi?");
        String group = scanner.nextLine();

        System.out.println("tu atbildeji:");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(group);


    }

   
}
