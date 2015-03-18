package LinkList;

import java.util.Stack;

public class prob3_linkedlist {

}

class min_element{
	
	Stack<Integer> min = new Stack<Integer>();
	public void add_min_ele(Stack s1){
		if(!min.isEmpty()){
			if((Integer)min.peek()> (Integer)s1.peek()){
				min.push((Integer) s1.peek());
			}}
		
	}
}