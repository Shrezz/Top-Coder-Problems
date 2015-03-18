package LinkLists;

public class LinkNode {
	
	public LinkNode next=null;
	public int data;
	public LinkNode(int data){
		this.data = data;
	}
	public void appendToTail(int data){
		LinkNode end = new LinkNode(data);
		LinkNode n =this;
		while(n.next!=null){
			n = n.next;
		}
		n.next =end;
	}
	// Check if head node is the node to be deleted, if it is Head changes; other wise it doesn't.
	public LinkNode delete(LinkNode head,int data){
		LinkNode n = head;
		if(head.data == data){
			return head.next;
		}
		while(n.next!=null){
			if(n.next.data == data){
			//	int temp = n.next.data;
				n.next = n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
}
