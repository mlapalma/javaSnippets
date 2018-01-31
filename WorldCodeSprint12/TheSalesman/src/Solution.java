import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumTime(int[] x) {
        int min=1000;
        int max=0;
        for (int element:x) {
            if (element>=max)
                max=element;
            if (element<=min)
                min=element;
        }
        return max-min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Streets Quantity
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            //Houses Quantity for each street
            int n = in.nextInt();
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            int result = minimumTime(x);
            System.out.println(result);
        }
        in.close();
    }
}
