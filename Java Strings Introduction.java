import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length()+B.length();
        System.out.println(sum);
        int val = A.compareTo(B);
        if(val>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        String s1 = A.substring(0, 1).toUpperCase();
        String s2 = B.substring(0, 1).toUpperCase();
        String nameCapitalized1 = s1 + A.substring(1);
        String nameCapitalized2 = s2 + B.substring(1);
        System.out.println(nameCapitalized1+" "+nameCapitalized2);
    }
}



