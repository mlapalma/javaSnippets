
package plusminus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] values=new int[n];
        for(int i=0; i<n;i++){
            values[i]=in.nextInt();
        }
        Map<String,Float> fractions = fractions(values);
        System.out.println(String.format("%.6f",fractions.get("positive")));
        System.out.println(String.format("%.6f",fractions.get("negative")));
        System.out.println(String.format("%.6f",fractions.get("zeroes")));
    }

    private static Map<String,Float> fractions(int[] values){
        Map<String,Float> fractions = new HashMap<String,Float>();
        int totalQty=values.length;
        int positiveQty=0;
        int negativeQty=0;
        int zeroQty=0;
        for(int x=0;x<totalQty;x++){
            if(values[x]>0)
               positiveQty++;
            else if(values[x]<0)
                negativeQty++;
            else
                zeroQty++;

        }
        fractions.put("positive",positiveQty/(float)totalQty);
        fractions.put("negative",negativeQty/(float)totalQty);
        fractions.put("zeroes",zeroQty/(float)totalQty);
        return fractions;
    }

}
