import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {
        int result=0;
        if(n>1)
            result=n*factorial(n-1);
        else
            result=1;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

}
