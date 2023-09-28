import java.util.*;

public class bainry {
    public static int bainaryserch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {//
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 3, 5, 2, 9, 8, 0, 4 };
        int key = sc.nextInt();
        // int key = 9;
        System.out.println("index for key is:" + bainaryserch(numbers, key));
    }
}