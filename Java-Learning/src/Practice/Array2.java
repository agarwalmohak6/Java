/* The Olympic results are given in a table, where each row represents a country, and columns
represent gold, silver, and bronze medals. For example, the element r[0][0] is the number
of gold medals earned by the 0-th country. Write a method that takes the table as an
input, and returns a new array which lists the total number of medals for each country.
For example, if we start with the table
2   0   1
3   2   0
0   0   2
in which the 0-th country earned 2 + 0 + 1 = 3 medals,
the 1-st country earned 3 + 2 + 0 = 5 medals, and
the 2nd country earned 0 + 0 + 2 = 2 medals, your method should return an array with values
3
5
2
*/
package Practice;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column number with space in between:-");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("Enter elements:-");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				arr[i][j] = sc.nextInt();
		}
		for (int i = 0; i < r; i++) {
			int s = 0;
			for (int j = 0; j < c; j++)
				s += arr[i][j];
			System.out.println(s);
			s = 0;
		}
	}
}
