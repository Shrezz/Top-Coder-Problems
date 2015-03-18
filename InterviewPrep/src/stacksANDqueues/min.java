package stacksANDqueues;

public class min extends Stack<Integer> {
	Stack<Integer> s ;
	public min(){
		s = new Stack<Integer>();
	}
	
	public void push(int n){
		if(n<= min()){
			s.push(n);
		}
		super.push(n);
	}
	public Integer pop(){
		int temp = super.pop();
		if(temp == s.peek()){
			s.pop();
		}
		return temp;
		
	}
	public int min(){
		if(s.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return s.peek();
		}
	}
}	
