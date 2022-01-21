package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!arrayList.contains(arr[i]))
                arrayList.add(arr[i]);
        }
        for (Integer i : arrayList)
            System.out.print(i + " ");
    }
}
