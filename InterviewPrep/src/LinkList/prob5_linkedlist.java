package LinkList;

import java.util.Stack;

public class prob5_linkedlist{
	
	public static void main(String args[]){
		
		MyQueue q  = new MyQueue();
		q.push(7);
		q.push(5);
		System.out.println(q.peek());
	}
}

class MyQueue {
	
	Stack<Integer> s1,s2;
	public MyQueue(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	public void push(int num){
		s1.push(num);
	}
	public int peek(){
		reverseStacks();
		if(s2==null){
			return (Integer) null;
		}
		return (Integer) s2.pop();
	}
	public int pop(){
		reverseStacks();
		if(s2== null){
			return (Integer) null;
		}
		return (Integer) s2.pop();
	}
	public void reverseStacks(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}
}
