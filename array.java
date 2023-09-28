import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class array {
    public static int bainarysearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int linersearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]) {
        int start = 0, last = numbers.length - 1;
        while (start < last) {
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int key = sc.nextInt();
        // System.out.println("index of key is :" + bainarysearch(numbers, key));
        /*
         * int numbers[] = { 1, 4, 3, 6, 7, 9, 8, 10 };
         * int key = sc.nextInt();
         * int index = linersearch(numbers, key);
         * if (index == -1) {
         * System.out.println("not found");
         * } else {
         * System.out.println("your key at index is:" + index);
         * }
         */
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}