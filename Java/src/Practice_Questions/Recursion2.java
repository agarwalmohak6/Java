package Practice_Questions;
/*
Write a program to print numbers from 1 to n in increasing order recursively.
         Sample Input 1 :
         6
         Sample Output 1 :
         1 2 3 4 5 6
*/

import java.util.Scanner;

public class Recursion2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int n = sc.nextInt();
		System.out.print("Natural numbers till " + n + ":");
		natural(n, 1);
	}

	static int natural(int y, int i) {
		if (i <= y) {
			System.out.print(i + " ");
			return (natural(y, ++i));
		}
		return 1;
	}
}