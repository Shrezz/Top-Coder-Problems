package Trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class createLevelLinkedList_BFS {

	public static ArrayList<LinkedList<Tree>> createLevelLinkedList(Tree node){
		ArrayList<LinkedList<Tree>> result = new ArrayList<LinkedList<Tree>>();
		LinkedList<Tree> current = new LinkedList<Tree>();
		if(node!=null){
			current.add(node);
		}
		while(current.isEmpty() == false){
			result.add(current);
			LinkedList<Tree> parents = current;
			current = new LinkedList<Tree>();
			for(Tree parent:parents){
				if(parent.left!=null){
					current.add(parent.left);
				}
				if(parent.right!=null){
					current.add(parent.right);
				}
			}
		}
		return result;
	}
}
