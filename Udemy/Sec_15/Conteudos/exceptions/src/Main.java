import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);

        method1();

        System.out.println("End of program!");
    }

    public static void method1() {
        System.out.println("*** Method1 Start ***");
        method2();
        System.out.println("*** Method1 Start ***");
    }
    public static void method2() {
        System.out.println("*** Method2 Start ***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("*** Method2 End ***");
    }
}