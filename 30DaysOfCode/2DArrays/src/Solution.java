import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }

        }
        System.out.println(sumHourGlassessAndRetrieveMaximum(arr));
    }

    private static int sumHourGlassessAndRetrieveMaximum(int[][] values){
        int[] results = new int[15];
        int maxSum=-36;
        int resultsIdx=0;
        for(int i_iterator=0; i_iterator<4;i_iterator++){
            for(int j_iterator=0; j_iterator<4;j_iterator++){
                    results[resultsIdx]=values[i_iterator][j_iterator]+values[i_iterator][j_iterator+1]+values[i_iterator][j_iterator+2]
                            +values[i_iterator+1][j_iterator+1]+values[i_iterator+2][j_iterator]
                            +values[i_iterator+2][j_iterator+1]+values[i_iterator+2][j_iterator+2];
                    resultsIdx++;
            }
        }

        for (int result:results) {
            if (result>maxSum)
                maxSum=result;
        }
        return maxSum;
    }

}
