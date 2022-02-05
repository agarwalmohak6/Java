/* Print an array that contains the exact same number as the given array, but rearrange
so that all the even numbers come before all the odd numbers. Other than that,
the numbers can be in any order. You may modify and print the given array, or make a new array.

Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
*/
package Practice;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int ans[] = new int[n];
		int even = 0, odd = n - 1;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0)
				ans[even++] = arr[i];
			else
				ans[odd--] = arr[i];
		}
		for (Integer i : ans)
			System.out.print(i + " ");
	}
}
