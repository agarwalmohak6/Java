/*
Write a program to find whether the array of integers contains a duplicate number.
If yes print the location where duplicate numbers are found.
 */
package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicate_number_index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements-");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (!al.contains(arr[i]))
				al.add(arr[i]);
		}
		System.out.println("positions are - ");
		for (Integer i : al) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i == arr[j]) {
					count++;
					if (count > 1)
						System.out.println(j + 1);
				}
			}
		}
	}
}