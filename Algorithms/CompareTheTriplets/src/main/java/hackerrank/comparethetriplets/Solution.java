package hackerrank.comparethetriplets;

import java.util.Scanner;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] solution=new int[2];
        int aScore=0;
        int bScore=0;

        if(a0!=b0)
            if(a0>b0)
                aScore++;
            else
                bScore++;

        if(a1!=b1)
            if(a1>b1)
                aScore++;
            else
                bScore++;

        if(a2!=b2)
            if(a2>b2)
                aScore++;
            else
                bScore++;

        solution[0]=aScore;
        solution[1]=bScore;

        return solution;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
