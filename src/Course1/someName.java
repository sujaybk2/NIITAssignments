package Course1;
import java.util.Scanner;

public class someName {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); //standard input from user
        System.out.println("Please enter two numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
