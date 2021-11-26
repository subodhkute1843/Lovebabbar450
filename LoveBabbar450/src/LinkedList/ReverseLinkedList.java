package LinkedList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class ReverseLinkedList {

	static Node head;
	public void printList() {
		if(isEmpty()) {
			System.out.println("list is empty...");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	Node reverse(Node head) {
		
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String[] args) {
		
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
        System.out.println("given linked list is");
        list.printList();
        head = list.reverse(head);
		System.out.println("\nreverse list");
		list.printList();
	}

}
