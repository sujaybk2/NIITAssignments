package Course1.Demo;
import java.util.Scanner;
/*

Algorithm:
Step 1: Start
Step 2: Input ageNo //get age number from the user
Step 3: Check if(ageNo >= 18). If true, jump to step 4. If false, jump to step 5.
Step 4: If true, Print "This person is eligible to vote"
Step 5: If false, Print "This person is ineligible to vote"
Step 6: Stop

Pseudocode:
Begin
    int ageNo
    if(ageNo >= 18)
        Print "This person is eligible to vote"
    else
        Print "This person is ineligible to vote"
End

*/

public class eligibleForVoting{
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the person's age");
    int age = obj.nextInt();
    if (age >= 18){
        System.out.println("The person is eligible to vote");}
    else{
            System.out.println("The person is ineligible to vote");
        }
    }
}


