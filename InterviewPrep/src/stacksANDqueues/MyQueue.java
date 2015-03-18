package stacksANDqueues;

public class MyQueue {
	Stack<Integer> newest = new Stack<Integer>();
	Stack<Integer> oldest = new Stack<Integer>();
	
	public void add(int value){
		newest.push(value);
	}
	public void shiftStacks(){
		while(oldest.isEmpty()){
			while(!newest.isEmpty()){
				oldest.push(newest.pop());
			}}
	}
	public Integer pop(){
		shiftStacks();
		return oldest.pop();
	}
}
