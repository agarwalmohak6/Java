package Practice_Questions;
/*
Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
        They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

        Example

        Imagine the size of both the arrays are 5

        myarr1[]  values  {3,4,1,2,2}
        myarr2[] values  {1,2,1,3,1}

        Output :
        1,0,5,2,2
*/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            int c = 0;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] <= arr2[j])
                    c++;
            }
            System.out.print(c + " ");
        }
    }
}
