package Course2.Sprint2PC2MaximumAge;

public class MaxAge {

    public int getMaxAge(int[] age) {
        int maxAge = Integer.MIN_VALUE;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > maxAge) {
                maxAge = age[i];
            }
        }
        return maxAge;
    }

    public static void main(String[] args) {
        int[] age = {23, 34, 33, 24, 25, 26, 31};
        MaxAge maxAge = new MaxAge();
        int max = maxAge.getMaxAge(age);
        System.out.println("Max Age: " + max);
    }
}
