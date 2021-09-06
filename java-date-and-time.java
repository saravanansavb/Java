import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        int odd=0;
        int y=year-1;
        while(y>400)
        {
            y=y-400;
        }
        while(y>300)
        {
            y=y-300;
            odd=odd+1;
        }
        while(y>200)
        {
            y=y-200;
            odd=odd+3;
        }
        while(y>100)
        {
            y=y-100;
            odd=odd+5;
        }
        int leap=(int)(y/4);
        odd=odd+(leap*2)+(y-leap);
        odd=odd%7;
        for(int i=1;i<month;i++)
        {
            switch (i) {
            case 1:
                odd=odd+3;
                break;
            case 2:
                if(year%4==0)
                    odd=odd+1;
                else
                    odd=odd+0;
                break;
            case 3:
                odd=odd+3;
                break;
            case 4:
                odd=odd+2;
                break;
            case 5:
                odd=odd+3;
                break;
            case 6:
                odd=odd+2;
                break;
            case 7:
                odd=odd+3;
                break;
            case 8:
                odd=odd+3;
                break;
            case 9:
                odd=odd+2;
                break;
            case 10:
                odd=odd+3;
                break;
            case 11:
                odd=odd+2;
                break;
            case 12:
                odd=odd+3;
                break;
            }
        }
        odd=odd+day;
        odd=odd%7;
        switch (odd) {
            case 0:
                return "SUNDAY";
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
        }
        return "";
    }             
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
