/**
* Class Name: NodeDriver
* Purpose: This class instantiates new node objects and prints them out as they are added to the linked list
* 
* Variables:
*		1) previous: Node ahead of the current node
*		2) next: Node that references the node after the current node
*		3) Scan: Scans user input
*		4) number: Integer value contained in the node
*/
import java.util.Scanner;

public class NodeDriver{


	public static void main(String[] args){

		/* Create Nodes */
		Node previous= null;
		Node next= null;

		/*Create Scanners to read how many inputs and the inputs themselves
		* Scan reads in the number of values the user wants to add to L.list
		* Scan2 reads in the actual values that are being added to the L.list
		*/
		Scanner scan= new Scanner(System.in);	
		Scanner scan2= new Scanner(System.in); 

		/*Read in user input and create the necessary nodes to store them*/
		int i= 0;
		System.out.println("\nPlease enter the number of items you'd like to add");
		int xinputs= scan.nextInt(); 
		System.out.println("\nPlease enter the values you'd like to add");
		
		for(i= 0; i<xinputs; i++){
 			int value= scan2.nextInt();
 			Node currentNode = new Node(value, previous, next);
 			currentNode.addToList();
 			currentNode.toString();
		}


		//Node myNode= new Node(number, front,next);
	}
}