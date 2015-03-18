package Trees;

public class findLCA {
	private static boolean covers(Tree root, Tree node){
		if(root==null){
			return false;
		}
		if(root == node){
			return true;
		}
		return covers(root.left, node)|| covers(root.right,node);
	}
	private static Tree helperLCA(Tree node, Tree p, Tree q){
		if(node==null){
			return null;
		}
		if(p==node||q==node){
			return node;
		}
		boolean is_p_on_left = covers(node.left,p);
		boolean is_q_on_left = covers(node.left,q);
		if(is_p_on_left != is_q_on_left) return node;
		Tree child_side = is_p_on_left? node.left : node.right;
		return helperLCA(child_side,p,q);
	}
	
	public static Tree findLCA(Tree node, Tree p, Tree q){
		
		if((!covers(node,p)) || (!covers(node,q))){
			return null;
		}
		return helperLCA(node,p,q);
	}
	
	
}
