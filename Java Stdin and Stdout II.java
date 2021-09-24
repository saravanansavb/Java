import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String h = scan.nextLine();
        System.out.println("String: " + h);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
