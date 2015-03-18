package stacksANDqueues;

public class sortStacks_3_6 {
	Stack<Integer> r = new Stack<Integer>();
	public void sort(Stack<Integer> s){
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!r.isEmpty() && r.peek()>temp){
				s.push(r.pop());
			}
			r.push(temp);
		}
		printStack(r);
		}
	public void printStack(Stack r){
		
	while(!r.isEmpty()){
		System.out.println(r.pop());
	}

	}
}
