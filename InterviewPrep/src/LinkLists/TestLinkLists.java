package LinkLists;

public class TestLinkLists {

	public static void main(String args[]){
		LinkNode n = new LinkNode(0);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(6);
		n.appendToTail(7);
		n.appendToTail(8);
		n.appendToTail(9);
		kthToLastElement kle = new kthToLastElement();
		System.out.println(kle.findEle(n, 8));
		//RemoveDuplicates_2point1LL rd = new RemoveDuplicates_2point1LL();
		//System.out.println();
		//n = rd.removeduplicates(n);
		//removedups.removedups(n);
		//n = n.delete(n, 5);
		//System.out.print(n.data+"-->");
		/*while(n.next !=null){
			System.out.print(n.next.data+">");
			n=n.next;
		}*/
	}
}
