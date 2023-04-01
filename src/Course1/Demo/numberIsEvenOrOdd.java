package Course1.Demo;
import java.util.Scanner;
/*
Algorithm:
Step 1: Start
Step 2: input getInt
Step 3: if(getInt%2==0)
Step 4: If true, print "The number is even"
Step 5: If false, print "The number is odd"
Step 6: End

Pseudocode:
Begin
    input getInt
    if(getInt%2==0)
        print "The number is even"
    else
        print "The number is odd"
End

 */
public class numberIsEvenOrOdd {
    public static void main(String[] args) {
        //int getInt;
        Scanner getInt = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = getInt.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");}
        else
            {
                System.out.println("The number is odd");
            }
        }
    }

