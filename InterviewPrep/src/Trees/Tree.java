package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	Tree right;
	Tree left;
	/*Including parent pointer (for some assumptions)*/
	Tree parent;
	int value;
	
	public Tree(int root){
		this.value = root;
		this.parent = null;
		this.right = null;
		this.left = null;
	}
	public static Tree add(Tree root, int value){
		if(root == null) {
			root = new Tree(value);
			return root;
		}
		if(value<root.value){
				root.left = add(root.left,value);
				root.left.parent = root;
				//System.out.println("Child is: "+root.left.value+" Parent is: "+root.left.parent.value);
		}
		else if(value>root.value){
				root.right = add(root.right,value);
				root.right.parent = root;
				//System.out.println("Child is: "+root.right.value+" Parent is: "+root.right.parent.value);
		}
	
		//System.out.println();
		
		return root;
	}
	public static void preorder(Tree n){
		if(n!=null){
			System.out.print(n.value+" ");
			preorder(n.left);
			preorder(n.right);
	}}
	public static void postorder(Tree n){
		if(n!=null){
			postorder(n.left);
			postorder(n.right);
			System.out.print(n.value+" ");
	}}
	public static void inorder(Tree n){
		if(n!=null){
			inorder(n.left);
			System.out.print(n.value+" ");
			inorder(n.right);
	}}
	public void delete(Tree n){
		
	}
	public static void levelorder(Tree n){
		if(n == null){
			System.out.println("Tree is empty");
			return;
		}
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(n);
		while(q.isEmpty()!= true){
			Tree node = q.remove();
			if(node!=null){
				System.out.print(node.value+" ");
				if (n.left !=null){ 
					q.add(node.left);
				}
				if(n.right !=null){
					q.add(node.right);
			}}}
		}
	public static void main(String args[]){
/*		Tree t1 = new Tree(10);
		Tree t2 = new Tree(15);
		BalanceTree bt = new BalanceTree();
		*/
		
		Tree root=null;
		root = add(root, 10);
		add(root,5);
	//	t2 = add(t2,12);
		add(root, 20);
		add(root, 12);
		add(root, 25);
		add(root, 23);
		add(root, 26);
		add(root, 3);
		add(root,6);
		inorder(root);
		System.out.println();
		System.out.println(root.right.right.right.value);
		System.out.println(inorderSuccessor.findinorderSuccessor(root.right.right.right, true));
		/*inorder(root);
		System.out.println(inorderSuccessor.findinorderSuccessor(root.right.right.left, true));
		System.out.println();
		inorder(t2);
		System.out.println();*/
		/*subTrees.checkTree(t1, t2);
		int height = bt.height(root);
		System.out.println("Is Tree Balanced: "+ bt.isBalanced(root));
		if(bt.optimizedHeight(root)==-1){
			System.out.println("Tree is not balanced");
		}
		else{
			System.out.println("Tree is balanced");
		}
		Tree root = null;
		root = CreateBSTfromArray.createminimalBST(root, CreateBSTfromArray.min, CreateBSTfromArray.max);
		preorder(root);	*/
		/*Tree root = null;
		root = binaryTree.createBinaryTree(root, 2);
		binaryTree.createBinaryTree(root,3);
		binaryTree.createBinaryTree(root,5);
		binaryTree.createBinaryTree(root,7);
		binaryTree.createBinaryTree(root,9);
		//binaryTree.createBinaryTree(root,12);
		//binaryTree.createBinaryTree(root,25);
		binaryTree.isBST(root);
		findLCA  flca = new findLCA();
		System.out.println(flca.findLCA(root, root.left.left, root.left.right).value);
		String s ="abcdse";
		int c= (int) s.charAt(1);
		System.out.println(c);*/
		/*createLevelLinkedList_BFS cll = new createLevelLinkedList_BFS();
		ArrayList<LinkedList<Tree>> lists = cll.createLevelLinkedList(root);
		for (int i=0;i<lists.size();i++){
			LinkedList<Tree> list = lists.get(i);
			for (int j=0;j<list.size();j++){
				System.out.print(list.get(j).value+"--->");
			}
			System.out.println();
		}*/
		//inorder(root);
		/*Tree root = null;
		root  = add(root,2);
		add(root, 3);
		add(root, 5);
		add(root, 12);
		add(root, 11);
		add(root, 14);
		add(root, 6);
		add(root,11);
		add(root,17);
		add(root,18);*/
		levelorder(root);
		depthFirst.dfs(root);
		//findSumPath.findSum(root, 5);
}}
