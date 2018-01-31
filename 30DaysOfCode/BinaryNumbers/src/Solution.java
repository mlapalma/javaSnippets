import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert a base 10 number: ");
        Integer base10=scan.nextInt();
        List<Integer> result = tobase2(base10);
        System.out.println(consecutive1s(result));
    }

    private static List<Integer> tobase2(int base10){
        List<Integer> result= new ArrayList<Integer>();
        List<Integer> reminders= new ArrayList<Integer>();
        int number=base10;

        while(number>0){
            reminders.add(number%2);
            number=number/2;
        }

        for(int x=reminders.size()-1;x>=0;x--){
            result.add(reminders.get(x));
        }
        return result;
    }

    private static int consecutive1s(List<Integer> base2number){
        int result=0;
        int max=0;
        for (Integer element:base2number) {
            if (element == 1)
                result++;
            if (result > max)
                max = result;
            if (element == 0)
                result = 0;
        }
        return max;
    }
}
