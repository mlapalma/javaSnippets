import java.util.Scanner;

public class Solution {

    //Repensar, el tipo de movimiento probablemente tenga que ser un array con las opciones, ya que posteriormente se usa

    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        //  Print the distance along with the sequence of moves.
        int distance=Math.abs(i_start-i_end)+(j_start-j_end);
        int moves=0;
        while(distance!=0 && distance!=-1){
            int newJStart=j_start;
            int newJEnd=j_end;
            int newIStart=i_start;
            int newIEnd=i_end;
            int newDistance=distance;

            if()

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i_start = in.nextInt();
        int j_start = in.nextInt();
        int i_end = in.nextInt();
        int j_end = in.nextInt();
        printShortestPath(n, i_start, j_start, i_end, j_end);
        in.close();
    }

    static int betterMove(int i_start, int j_start, int i_end, int j_end, int origDistance){
        int newDistance=origDistance;

        //moveJUL

    }

    static String[] move(int[] startPos,int[] endPos, int actualDistance){
        int newDistance=actualDistance;
        int[] newStart

    }
    static int moveJUL(int n, int max){
        int result = n - 1;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveJUR(int n, int max){
        int result = n + 1;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveJR(int n, int max){
        int result = n + 2;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveJLR(int n, int max){
        int result = n + 1;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveJLL(int n, int max){
        int result = n - 1;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveJL(int n, int max){
        int result = n - 2;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

/**/

    static int moveIUL(int n, int max){
        int result = n - 2;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveIUR(int n, int max){
        int result = n - 2;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveIR(int n, int max){
            return n;
    }

    static int moveILR(int n, int max){
        int result = n + 2;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveILL(int n, int max){
        int result = n + 2;
        if(result<=max && result>=0)
            return result;
        else
            return -1;
    }

    static int moveIL(int n, int max){
            return n;
    }

}
