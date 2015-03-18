package LinkLists;

import java.util.HashSet;

public class removedups {

	public static Node removedups(Node head){
		if(head==null){
			return null;
		}
		HashSet<Integer> hs= new HashSet<Integer>();
		Node previous = null;
		System.out.print(head.data+"-->");
		while(head !=null){
			if(hs.contains(head.data)){
					previous.next = head.next;}
			else{
				hs.add(head.data);
				previous = head;
			}
			//System.out.print(head.data+"-->");
			head= head.next;		
		}
		return head;
		}
	
}
