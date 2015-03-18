package Trees;

public class subTrees {

	public static boolean matchTree(Tree t1, Tree t2){
		
		if(t1==null && t2==null){
			return true;
		}
		if(t1==null||t2==null){
			return false;
		}
		if(t1.value==t2.value){
			return matchTree(t1.left,t2.left) && matchTree(t1.right,t2.right);
		}
		else{
			return matchTree(t1.left,t2) || matchTree(t1.right,t2);
		}
	}
	public static void checkTree(Tree t1,Tree t2){
		if(t2 == null){
			System.out.println("Tree T2 is a sub tree of T1");
		}
		else{
			if(matchTree(t1,t2)){
				System.out.println("Tree T2 is a sub tree of T1");
			}
			else{
				System.out.println("Tree T2 is not a sub tree of T1");
			}
		}}
}