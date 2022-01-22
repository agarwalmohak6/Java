package Array;

import java.util.Scanner;

public class LongestStringInArrayOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int l = 0;
		String[] arr = new String[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
			if (l < arr[i].length())
				l = arr[i].length();
		}
		System.out.println("The max length string is: ");
		for (int i = 0; i < n; i++) {
			if (arr[i].length() == l)
				System.out.println(arr[i]);
		}
	}
}
