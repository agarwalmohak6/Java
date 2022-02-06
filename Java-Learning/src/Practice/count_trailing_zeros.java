/*Me Bean is very good in mathematics. He was given a number n and was told to find out number
of trailing zeroes in n! (Factorial) . Can you help him?

Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero.
Implement it by using loop
 */
package Practice;

import java.util.Scanner;

public class count_trailing_zeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 1, c = 0;
		for (int i = 1; i <= n; i++)
			f *= i;
		System.out.println(f);
		String s = "" + f;
		System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '0')
				c++;
			else
				break;
		}
		System.out.println("Number of trailing zero are: " + c);
	}
}