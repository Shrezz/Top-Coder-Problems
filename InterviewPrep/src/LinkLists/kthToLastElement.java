package LinkLists;

public class kthToLastElement {
	public Integer findEle(LinkNode head, int k){
		if(k<=0) return null;
		LinkNode current = head;
		LinkNode runner = head;
		int i=0;
		while(i !=k-1){
			if(runner==null) return null;
			runner = runner.next;
			i++;
		}
		if(runner == null) return null;
		while(runner.next!=null){
			current = current.next;
			runner = runner.next;
		}
		return current.data;
	}
}
