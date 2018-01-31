import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] elements){
        this.elements=elements;
    }

    public void computeDifference(){
        int min=elements[0];
        int max=elements[0];
        for(int element:elements){
            if(element<=min)
                min=element;
            if(element>=max)
                max=element;
        }
        this.maximumDifference=max-min;
    }
}
