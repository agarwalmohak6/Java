/*   Linear Searching   */

package arrays;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10};
        System.out.println("The array held is ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter an element to be searched");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        boolean match = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                match = true;
                System.out.println("Element found at position " + (i + 1));
            }
        }
        if (match != true)
            System.out.println("Element not found");
    }
}
