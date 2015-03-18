package Trees;

public class BalanceTree {
	public static final int BALANCED_TREE_HEIGHT =1;
	public int height(Tree n){
		if(n==null){
			return 0;
		}
		return Math.max(height(n.left), height(n.right))+1;
	}
	public boolean isBalanced(Tree node){
		if(node==null){
			return true;
		}
		int height_diff = Math.abs(height(node.left) - height(node.right));
		if (height_diff > 1){
			return false;
		}
		else{
			return isBalanced(node.left)&&isBalanced(node.right);
		}
	}
	public int optimizedHeight(Tree node){
		if(node==null){
			return 0;
		}
		int left_height = optimizedHeight(node.left);
		if(left_height ==-1){
			return -1;
		}
		int right_height = optimizedHeight(node.right);
		if(right_height ==-1){
			return -1;
		}
		int height_diff = Math.abs(left_height - right_height);
		if(height_diff>BALANCED_TREE_HEIGHT){
			return -1;
		}
		else{
			return Math.max(left_height, right_height)+1;
		}
	}
}
