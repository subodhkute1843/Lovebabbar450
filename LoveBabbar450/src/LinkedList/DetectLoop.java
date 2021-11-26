package LinkedList;

import java.util.HashSet;

class Node3{
	int data;
	Node3 next;
	
	Node3(int data){
		this.data= data;
		next = null;
	}
}

public class DetectLoop {

	Node3 head;
	void push(int data) {
		Node3 newNode = new Node3(data);
		newNode.next = head;
		head = newNode;
	}
	
	boolean detectLoop() {
		
		// If list is empty or has only one node
        // without loop
        if (head == null || head.next == null) {
        	System.out.println("empty or one node");
            return false;
        }
		
		System.out.println("head: "+head.data);
		Node3 slow = head;
		Node3 fast = head;
		
		slow = slow.next;
		fast = fast.next.next;
		
		while(fast.next != null && fast != null) {
			if(fast == slow) {
				System.out.println(fast.data);
				System.out.println(slow.data);
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return false;
	}
	
	
//	boolean detectLoop() {
//	
//		HashSet<Node3> hs = new HashSet<Node3>();
//		Node3 temp = head;
//		while(temp != null) {
//			if (hs.contains(temp)) {
//				return true;
//			}
//			hs.add(temp);
//			temp = temp.next;
//		}
//		
//		return false;
//	
//	}

	void printList() {
		Node3 temp = head;
		while (temp != null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {

		DetectLoop list = new DetectLoop();
		 
//        list.push(20);
//        list.push(4);
//        list.push(15);
//        list.push(10);
		
		list.head = new Node3(50);
        list.head.next = new Node3(20);
        list.head.next.next = new Node3(15);
        list.head.next.next.next = new Node3(4);
        list.head.next.next.next.next = new Node3(10);
 
        list.printList();
        /*Create loop for testing */
        list.head.next.next.next.next = list.head;
        
        if (list.detectLoop())
            System.out.println("\nLoop found");
        else
            System.out.println("\nNo Loop");
		
	}

	
}
