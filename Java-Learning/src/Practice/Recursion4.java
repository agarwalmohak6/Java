package Practice;
/*
Write a program to find and return the sum of all elements of the array. Do this recursively.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
*/

import java.util.Scanner;
public class Recursion4 {
	static int sum(int A[], int n) {
		if (n <= 0)
			return 0;
		return (sum(A, n - 1) + A[n - 1]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:- ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array elements:- ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Sum of array elements is:- ");
		System.out.println(sum(arr, n));
	}
}