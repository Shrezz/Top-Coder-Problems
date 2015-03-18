package Trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class createLevelLinkedList_DFS {
	
	private static void createLevelLinkedList(Tree node, ArrayList<LinkedList<Tree>> lists,int level){
		if(node==null){
			return;}
		LinkedList<Tree> list = null;
		if(lists.size() == level){
			list = new LinkedList<Tree>();
			lists.add(list);
		}
		else{
			list = lists.get(level);
		}
		list.add(node);
		createLevelLinkedList(node.left,lists,level+1);
		createLevelLinkedList(node.right,lists,level+1);
	}
	public ArrayList<LinkedList<Tree>> createLevelLinkedList(Tree node){
		ArrayList<LinkedList<Tree>> lists = new ArrayList<LinkedList<Tree>>();
		createLevelLinkedList(node,lists,0);
		return lists;
	}
}
