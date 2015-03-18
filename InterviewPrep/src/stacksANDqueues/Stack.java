package stacksANDqueues;

import LinkLists.LinkNode;

public class Stack<E> {
	
	LinkNode top;
	public boolean isEmpty(){
		//System.out.println(this.top.data);
		if (this.top== null) return true;
		return false;
	}
	public void push(int value){
		LinkNode n = new LinkNode(value);
		n.next = top;
		top = n;
		}
	
	public Integer pop(){
		if(top != null){
		int value = top.data;
		top = top.next;
		return value;
	}
		return null;
	}
	public int peek(){
		return top.data;
	}
	
}
