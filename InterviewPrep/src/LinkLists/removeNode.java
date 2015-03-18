package LinkLists;

public class removeNode {
	public void remove(LinkNode node){
		if(node==null || node.next ==null){
			System.out.println("Node is null or last node");
		}
			LinkNode next = node.next;
			node.next = next.next;
			node.data = next.data;
	}
}
