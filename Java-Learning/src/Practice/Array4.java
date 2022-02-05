/* Write a program to remove consecutive duplicate elements in an array.
Input values
10 10 30 30 40 50 50 50 9 45
Output
10 30 40 50 9 45
 */

package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (!ans.contains(arr[i]))
				ans.add(arr[i]);
		}
		for (Integer i : ans)
			System.out.print(i + " ");
	}
}
