// Reverse words in a string using stack.

package Practice;

import java.util.*;

public class Stack_Coding_Class {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String[] arr =s.split("\\s+");
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while(!st.isEmpty())
            System.out.print(st.pop()+" ");
    }
}