package LinkLists;

public class RemoveDuplicates_2point1LL {
	public LinkNode removeduplicates(LinkNode head){
		if(head==null) return null;
		LinkNode current = head;
		while(current !=null){
			LinkNode runner = current;
			while(runner.next!=null){
				if(current.data == runner.next.data){
					runner.next=runner.next.next;
				}
				else{
					runner= runner.next;}
			}
			current = current.next;
		}
		
		return current;
	}
}
