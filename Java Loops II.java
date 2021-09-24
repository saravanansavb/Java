import java.util.*;
import java.io.*;
import java.lang.Math;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int rslt=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int p=0;
            rslt= rslt + (int)(a+(Math.pow(2,p)*b));
            System.out.print(rslt+" ");
            for(int j=1;j<n;j++)
            {
                p++;
                rslt= rslt + (int)((Math.pow(2,p))*b);
                System.out.print(rslt+" ");
                
            }
            System.out.println();
        }
        in.close();
    }
}
