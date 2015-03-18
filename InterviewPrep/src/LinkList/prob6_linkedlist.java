package LinkList;

import java.util.Stack;

public class prob6_linkedlist {

	public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>();
		Sort obj = new Sort();
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(1);
		System.out.println(s);
		System.out.println(obj.sort(s));
	}
}
	
class Sort{
	
	public Stack sort(Stack s){
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()){
			int temp = (Integer)s.pop();
			while(!r.isEmpty() && r.peek()>temp){
			s.push(r.pop());
			}	
		r.push(temp);
		}
		return r;
	}
}
