package com.hackerrank.socketmerchant;

import java.io.*;
import java.util.*;

public class Solution {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		Set<Integer> colors = new HashSet<Integer>();
		int pairs = 0;

		for (int x = 0; x < n; x++) {
			int current = ar[x];
			if (colors.contains(current)) {
				pairs++;
				colors.remove(current);
			} else {
				colors.add(current);
			}
		}
		return pairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(result);

		scanner.close();
	}
}

