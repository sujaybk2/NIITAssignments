package Course1.Demo;
import java.util.Scanner;
public class Add3Numbers {
    public static void main(String[] args) {
        int d;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        d= a+b+c;
        System.out.println(d);
    }
}
