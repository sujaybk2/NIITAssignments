package Course1.Demo;
import java.util.Scanner;
/*
Algorithm:
Step 1- Begin
Step 2- Accept 3 numbers
Step 3- check if any number is less than 0 or 0
step 4- If(any number is less than zero, then stop)
Step 5- else, continue with the operation
Step 6- End
 */

public class DivideNos {
    public static void main(String[] args) {
        double quotient;
//       if(num1 != 0 && num2 != 0 && num3 != 0) {
//            System.out.println("The number is positive");
//        }
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double num1 = obj.nextDouble();
        double num2 = obj.nextDouble();
        double num3 = obj.nextDouble();
        if(num1 > 0 && num2 > 0 && num3 > 0) {

        }
        else System.out.println("Program stopped");
        quotient = (num1/num2/num3);
        System.out.println(quotient);
    }
}
