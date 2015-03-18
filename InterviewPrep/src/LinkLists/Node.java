package LinkLists;

public class Node {

	public Node next = null;
	public int data;
	
	public Node(int d){
		data = d;
		//next = null;
	}
	public void add(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	public Node delete(Node head, int d){
		if(head == null){
			return null;
		}
		Node n = head;
		if(n.data == d){
			return head.next;
		}
		while(n.next!=null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}
