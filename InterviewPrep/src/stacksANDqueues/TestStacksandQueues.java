package stacksANDqueues;

public class TestStacksandQueues {
	public static void main(String args[]){
		/*Stack<Integer> node = new Stack<Integer>();
		node.push(5);
		node.push(12);
		node.push(4);
		node.push(11);
		//sortStacks_3_6 sS = new sortStacks_3_6();
		//sS.sort(node);*/
		MyQueue my = new MyQueue();
		my.add(5);
		my.add(6);
		my.add(7);
		System.out.println(my.pop());
	}
}
