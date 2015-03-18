package LinkList;

import java.util.HashSet;

import LinkList.sample.LinkList;

public class Link {
	
	public int number;
	public static Link n;
	
	public Link next;
	Link(int number){
		this.number = number;
	}
	
	public void display(){
		System.out.println(number);
	}
	public static void main(String args[])
	{
		/*LinkList ll = new LinkList();
		LinkList ll1 = new LinkList();
		ll.add(2);
		ll.add(4);
		ll.add(1);
		ll.add(5);
		ll.add(3);
		ll.add(7);
		//ll.display();
		//ll.findk(ll.firstLink,4);
		 ll.breakin2(ll, 5);*/
		//System.out.println(firstLink);
		//ll.display();
	//	n = ll.firstLink.next.next;
	//	Link c;
	//	ll.delete_node(ll,n);
	//	ll.add(10);
		//ll.add(5);
		//ll.add(5);
		//ll.remove_duplicates(ll);
	//	ll.display();
		
		//ll1.add(6);
		//ll1.add(3);
		//ll1.display();
		
		//ll.append(ll,ll1);
		//ll.MergeLists(ll, ll1);
	}
}
 class sample {

	public static LinkedListNode FindBeginning(LinkedListNode head) {
		LinkedListNode n1 = head;
		LinkedListNode n2 = head; 
		
		// Find meeting point
		while (n2.next != null) { 
			n1 = n1.next; 
			n2 = n2.next.next; 
			if (n1 == n2) { 
				break; 
			}
		}

		// Error check - there is no meeting point, and therefore no loop
		if (n2.next == null) {
			return null;
		}

		/* Move n1 to Head. Keep n2 at Meeting Point.  Each are k steps
		/* from the Loop Start. If they move at the same pace, they must
		 * meet at Loop Start. */
		n1 = head; 
		while (n1 != n2) { 
			n1 = n1.next; 
			n2 = n2.next; 
		}
		// Now n2 points to the start of the loop.
		return n2;
	}
class LinkedListNode
{
    public Object data;
    public LinkedListNode next;

    public LinkedListNode(Object data) {
    this.data = data;
    }
}
class LinkList{
	public Link firstLink;
	LinkList(){
		firstLink = null;
	}
	
	public void add(int value){
		Link newLink = new Link(value);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	
	public void display(){
		Link theLink = firstLink;
		while(theLink != null){
			theLink.display();
			//System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
		}
	}
	
	public void findk(Link firstLink, int k){
		Link p1 = firstLink;
		Link p2 = firstLink;
		
		for(int i =0;i<k;i++){
			if(p2==null) System.out.println("NULL");
			p2 = p2.next;
		}
		while(p2.next!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println(p1.number);
		
		
	}
	public void removeduplicates(LinkList l1){
		Link temp = l1.firstLink;
		Link prev =null;
		HashSet <Integer> s1 = new HashSet<Integer>();
		while(temp!=null){
			if(s1.contains(temp.number)){
				prev.next= temp.next;
				temp = temp.next;
			}
			else{
				//s1.add(temp.number);
				prev = temp;
				temp = temp.next;
			}
		}
		l1.display();
	}
	

	public Link breakin2(LinkList l1, int x){
		
		//l1.display();
		
		Link firstLink = l1.firstLink;
		Link head = null;
		Link tail=null;
		while(firstLink!=null){
			Link temp = firstLink.next;
			if(firstLink.number<x){
				firstLink.next= head;
				head = firstLink;
			}
			else{
				tail.next = firstLink;
				tail = firstLink;
			}
			firstLink = temp;
		}
		tail.next = null;
	
	l1.display();
		
		return firstLink;
	}
	
	public void remove_duplicates(LinkList l1){
		Link temp = l1.firstLink;
		Link prev =null;
		while(temp!=null){
			Link runner = temp;
			while(runner!=null){
				if(runner.next == temp){
					prev.next = temp.next;
					runner = runner.next.next;
				}
				else{
					prev = temp;
					runner = runner.next;	
				}
				temp = temp.next;
				}
		}
		l1.display();
	}
	
	public void delete_node(LinkList l1,Link n){
	
		l1.display();
		System.out.println(n.number);
		n.number = n.next.number;
		n.next = n.next.next;
		//Link temp = ;
		l1.display();
		}
	
	
	
	public void append(LinkList l1,LinkList l2){
		
		Link first = l1.firstLink;
		Link next = null;
		Link f2 = l2.firstLink;
		while(first.next !=null){
			first = first.next;
		}
		first.next= f2;
		f2 = null;
		l1.display();
	}
	
	public void MergeLists(LinkList l1,LinkList l2){
		Link list1 = l1.firstLink;
		Link list2 = l2.firstLink;
		if(list1 ==null) l2.display();
		if(list2==null) l1.display();
		
		Link head;
		if(list1.number<list2.number){
			head = list1;
		}
		else{
			head= list2;
			list2=list1;
			list1=head;
		}
		while(list1.next !=null && list2!= null){
			if(list1.next.number >list2.number){
				Link tmp = list1.next;
				list1.next = list2;
				list2 = tmp;
			}
			list1=list1.next;
		}
		if(list1.next==null) list1.next = list2;
		//l1.display();
		l2.display();
	}
	
}}

