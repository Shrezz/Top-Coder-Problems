package stacksANDqueues;

public class singleStack_fixedDivision {
	int stackSize = 100;
	int[] buffer = new int[stackSize*3];
	int[] stackPointer= new int[] {-1,-1,-1};
	 
	public void push(int stackNum,int value){
		if(stackPointer[stackNum] +1>= stackSize){
			System.out.println("The stack is full");
			}
		else{
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	}
	public int pop(int stackNum){
		int value=0;
		if(stackPointer[stackNum] == -1) System.out.println("The stack is empty");
		else{
			value = buffer[absTopOfStack(stackNum)];
			buffer[absTopOfStack(stackNum)] =0;
			stackPointer[stackNum]--;
		}
		return value;
	}
	public int absTopOfStack(int stackNum){
		return stackNum*stackSize+stackPointer[stackNum];
	}
	public int peek(int stackNum){
		if(stackPointer[stackNum] == -1) return -1;
		return buffer[absTopOfStack(stackNum)];
	}
	public static void main(String args[]){
		singleStack_fixedDivision ss = new singleStack_fixedDivision();
		ss.pop(0);
	}
}