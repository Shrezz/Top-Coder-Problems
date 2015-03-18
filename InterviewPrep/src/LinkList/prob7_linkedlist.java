package LinkList;

import java.util.LinkedList;

public class prob7_linkedlist {

	
}

abstract class Animal{
	private int order;
	String name;
	public Animal(String n){
		name =n;
	}
	public void setOrder(int n){
		order = n;
	}
	public int getOrder(){
		return order;
	}
	public boolean isOlder(Animal a){
		return this.order<a.getOrder();
	}	
}

class AnimalQueue{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		if(a instanceof Dog) dogs.addLast((Dog)a);
		if(a instanceof Cat) cats.addLast((Cat) a);
	}
	
	public Animal dequeueAny(){
		if(dogs.size()==0){
			return dequeueCats();
		}
		if(cats.size()==0){
			return dequeueDogs();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlder(cat)){
			return dequeueDogs();
		}
		else{
			return dequeueCats();
		}
	}
	public Dog dequeueDogs(){
		return dogs.poll();
	}
	public Cat dequeueCats(){
		return cats.poll();
	}
}

class Dog extends Animal{
	public Dog(String n){
		super(n);
	}
}

class Cat extends Animal{
	public Cat(String n){
		super(n);
	}
}
