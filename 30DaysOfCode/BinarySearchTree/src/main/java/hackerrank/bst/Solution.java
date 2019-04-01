package hackerrank.bst;

public class Solution {

	public static int getHeight(Node root){
		int height=0;
		if (root!=null){
			if (root.left!=null || root.right!=null){
				height=1+Math.max(getHeight(root.left),getHeight(root.right));
			}
		}

		return height;
	}

	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		else{
			Node cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}

}
