import java.util.*;

public class arraycc {
    public static void maxsumsubarray(int numbers[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];

        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currentsum = i == 0 ? prefix[j] : prefix[j - 1] - prefix[i - 1];

                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }

            }

        }
        System.out.println("max sum =" + maxsum);
    }

    public static void printsum(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max sub array sum is :" + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printsum(numbers);
    }
}
