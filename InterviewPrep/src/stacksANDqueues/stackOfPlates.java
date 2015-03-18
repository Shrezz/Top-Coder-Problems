package stacksANDqueues;

import java.util.ArrayList;

public class stackOfPlates {
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	public int capacity;
	
	public void push(int v){
		Stack last = getLastStack();
		if(last!=null ){//&& !last.isFull()){
			last.push(v);
		}
		else{
			Stack stack = new Stack();
			stack.push(v);
			stacks.add(stack);
		}
	}
	public Stack getLastStack(){
		if(stacks.size()==0) return null;
		return stacks.get(stacks.size()-1);
	}
	
}
