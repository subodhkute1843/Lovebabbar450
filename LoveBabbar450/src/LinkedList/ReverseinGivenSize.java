package LinkedList;

class Node2{
	int data;
	Node2 next;
	Node2(int data){
		this.data = data;
		next = null;
	}
}

public class ReverseinGivenSize {

	static Node2 head;
	
	public void add(int data) {
		Node2 addData = new Node2(data);
		if(head == null) {
			head = addData;
		}else {
			Node2 curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = addData;
		}
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
		}else {
			Node2 temp = head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
		
	}
	
	static Node2 reverse(Node2 head, int k) {
		if(head == null) {
			return null;
		}
		else {
			Node2 curr = head;
			Node2 prev = null;
			Node2 next = null;
			int count = 0;
			while(count < k && curr != null) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
				if(next != null) {
					reverse(next, k);
				}
			}
			return prev;
		}
		
		
	}
	
	public static void main(String[] args) {

		ReverseinGivenSize ll = new ReverseinGivenSize();
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		System.out.println("given list is ");
		ll.printList();
		int k = 4;
		System.out.println("\nafter reversing");
		head =  ll.reverse(head,k);
		ll.printList();
		
	}

}
