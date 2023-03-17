package Course2;
import java.util.Arrays;

public class ReverseArrayDemo {

    public int[] getReverseArray(int[] array) {
        int length = array.length;
        int[] reverseArray = new int[length];

        for (int i = 0; i < length; i++) {
            reverseArray[i] = array[length - i - 1];
        }

        return reverseArray;
    }

    public static void main(String[] args) {
        int[] array = {23, 34, 43, 56, 67, 78, 43, 35};
        ReverseArrayDemo reverseArrayDemo = new ReverseArrayDemo();
        int[] reverseArray = reverseArrayDemo.getReverseArray(array);
        System.out.println(Arrays.toString(reverseArray));
    }
}


