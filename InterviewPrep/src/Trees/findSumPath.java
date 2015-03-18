package Trees;

public class findSumPath {

	public static Integer  depth(Tree node){
		if(node == null){
			return 0;
		}
		else{
			return Math.max(depth(node.left),depth(node.right))+1;
		}
	}
	public static void findSum(Tree node, int sum){
		int depth = depth(node);
		int[] path = new int[depth];
		System.out.println(depth);
		findPath(node,path,sum,0);
	}
	public static void findPath(Tree node, int[] path,int sum, int level){
		if(node == null){
			return;
		}
		path[level] = node.value;
		int t=0;
		for(int i=level;i>=0;i--){
			t+= path[i];
			if(t==sum){
				print(path,i,level);
			}
		}
		findPath(node.left,path,sum,level+1);
		findPath(node.right,path,sum,level+1);
	}
	public static void print(int[] path,int start, int end){
		for(int i=start;i<=end;i++){
			System.out.println(path[i]+ " ");
		}
		System.out.println();
	}
}
