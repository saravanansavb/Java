import java.util.*;
import java.text.*;
import java.text.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nf.format(payment));
        //public Locale(String en,String INDIA)
        NumberFormat nf0 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.println("India: " + nf0.format(payment));
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf1.format(payment));
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf2.format(payment));
        //System.out.println("India: " + india);
    }
}
