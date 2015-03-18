package Trees;

public class inorderSuccessor {

	public static Integer findinorderSuccessor(Tree node,boolean isOriginalNode){
		if(node==null){
			System.out.println("No Successor found");
			return null;
		}
		else if(!isOriginalNode && node.parent ==null){
			System.out.println("No successor found");
			return null;
		}
		else if(node.right!=null && isOriginalNode){
			Integer min = getminimumEle(node.right);
			System.out.println("Successor is:" + min);
			return min;
		}
		else if(node.parent.left == node){
			System.out.println("Successor is: "+node.parent.value);
			return node.parent.value;
		}
		else{
			return findinorderSuccessor(node.parent,false);
		}
	}
	public static Integer getminimumEle(Tree node){
		
		while(node.left != null){
			node = node.left;
		}
		return node.value;
	}
}
