import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: doraoam
 * Date: 11/9/2556
 * Time: 14:08 น.
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Enter A: ");
        a = scanner.nextInt();
        System.out.println("Enter B: ");
        b = scanner.nextInt();

        System.out.println("A + B = " + (a+b));
        scanner.close();
        // Hello World
    }
}
