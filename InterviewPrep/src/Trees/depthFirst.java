package Trees;

public class depthFirst {
	
	public static void dfs(Tree root){
        if(root == null)    return;
        System.out.print(root.value+ " ");
        dfs(root.left);
        dfs(root.right);
    }
}
