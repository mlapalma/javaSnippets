package hackerrank.bst;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class BinarySearchTree {

	public static void main(String args[]){
		Integer[] inputs = {3,5,2,1,4,6,7};
		LinkedHashSet<Integer> values = new LinkedHashSet<Integer>(Arrays.asList(inputs));
		Node root=null;
		for (Integer input:values){
			root=Solution.insert(root,input);
		}
		int height=Solution.getHeight(root);
		System.out.println(height);
	}

}
