package Trees;

public class CreateBSTfromArray {
	
	public static final int[] SORTED_ARRAY  = {2,4,6,8,10};
	public static final int min = 0;
	public static final int max = SORTED_ARRAY.length-1;
	
	public static Tree createminimalBST(Tree root,int start,int end){
		
		if(end<start){
			return null;
		}
		int mid = (start+end)/2;
		root = Tree.add(root,SORTED_ARRAY[mid]);
		createminimalBST(root,start,mid-1);
		createminimalBST(root,mid+1,end);
		return root;
	}
	
	public int getHeight(int num){
		return (int) (Math.log(num)/Math.log(2));
	}
	
}
