package starTree;
import java.util.Scanner;
public class starTree {
    public static void main(String[] args) {
        int rowInput;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rowInput = obj.nextInt();
        int i,j;
        for (j = 0; j < rowInput; j++) {
            for (i = 1; i < j; i = i + 2)
            {
                System.out.printf("*");
            }
                System.out.println("");
            }
        }
    }
