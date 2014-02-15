/**
* Node class 
*	creates nodes for the linkedlist
*/


public class Node{
	
	public int value;
	public Node next;
	public Node previous;

	public Node(int value, Node next, Node previous){
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

	public int getValue(){
		return this.value;
	}

	public void addToList(){
		
	}

	public String toString(){
		System.out.println("The current node contains " + this.getValue());
		return null;
	}
}