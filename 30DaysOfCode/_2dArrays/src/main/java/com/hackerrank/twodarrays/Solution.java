package com.hackerrank.twodarrays;

import java.io.*;
import java.util.*;

public class Solution {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int maxHourglassValue=-9*7;
		int currentHourglassValue=0;
		for(int row=0;row<4;row++){
			for(int column=0;column<4;column++){
				currentHourglassValue=sumHourglassValues(extractHourGlassFromStartingPointIndex(row,column,arr));
				if(currentHourglassValue>maxHourglassValue){
					maxHourglassValue=currentHourglassValue;
				}
			}
		}
		return maxHourglassValue;
	}

	static int[][] extractHourGlassFromStartingPointIndex(int rowIndex, int columnIndex, int[][] arr){
		int[][] extractedHourglass=new int[3][3];
		for(int row=0;row<3;row++){
			for(int column=0;column<3;column++){
				int arrayRowIndex=row+rowIndex;
				int arrayColumnIndex=column+columnIndex;
				if(row==1 && column!=1){
					extractedHourglass[row][column]=0;
				} else {
					extractedHourglass[row][column]=arr[arrayRowIndex][arrayColumnIndex];
				}
			}
		}
		return extractedHourglass;
	}

	static int sumHourglassValues(int[][] hourGlass){
		int totalValue=0;
		for(int y=0;y<3;y++){
			for(int x=0;x<3;x++){
				totalValue+=hourGlass[x][y];
			}
		}
		return totalValue;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};

		int result = hourglassSum(arr);

		System.out.println(result);

		scanner.close();
	}
}

