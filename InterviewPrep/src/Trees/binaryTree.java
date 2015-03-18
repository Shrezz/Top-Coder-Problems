package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {

	
	public static Tree createBinaryTree(Tree node,int value){
		if(node ==null){
			node = new Tree(value);
			return node;
		}
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(node);
		while(!q.isEmpty()){
			Tree n = q.remove();
			if(n.left == null){
				n.left = new Tree(value);
				return n;}
			else if (n.right == null){
				n.right = new Tree(value);
				return n;}
			else{
				q.add(n.left);
				q.add(n.right);
			}}
		return null;
	}
	public static void isBST(Tree node){
		
		if(checkBST(node, null,null)){
			System.out.println("Yes, it is a binary search tree");
		}
		else{
			System.out.println("No, it is not a binary search tree");
		}
	}
	public static boolean checkBST(Tree node, Integer min, Integer max){
		
		if(node == null){
			return true;
		}
		if ((min!= null && node.value<=min)||(max!=null && node.value>max)){
			return false;
		}
		if((!checkBST(node.left,min,node.value)) || (!checkBST(node.right,node.value,max))){
			return false;
		}
		return true;
	}	
}
