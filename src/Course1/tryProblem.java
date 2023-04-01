package Course1;
import java.util.Scanner;
public class tryProblem {

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter two integers");
            int input1 = myObj.nextInt();
            int input2 = myObj.nextInt();
            System.out.println(input1 + input2);
            System.out.println(input1 - input2);
            System.out.println(input1 * input2);
            System.out.println(input1 / input2);
        }
    }
