package Array;

import java.util.Scanner;

public class LeftShiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shift = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int sh = 0; sh < shift; sh++) {
            int t = arr[0];
            for (int i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[n - 1] = t;
        }
        System.out.println("Array after " + shift + " left shifts become");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
