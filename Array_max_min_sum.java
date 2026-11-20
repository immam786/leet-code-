import java.util.Scanner;

public class Array_max_min_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter an Array of 5 values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Maximum of Array is:" + " " + max);
        System.out.println("Minimum of Array is:" + " " + min);
        System.out.println("Sum of the Array Elements is:" + " " + sum);
    }
}
