package linked_list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.append(7);
		myLinkedList.append(42);
		myLinkedList.append(11);
		
		myLinkedList.printList();
		
		System.out.println("Node removed: " + myLinkedList.removeLast().value);
		System.out.println("Node removed: " + myLinkedList.removeLast().value);
		
		myLinkedList.prepend(9);
		
		myLinkedList.printList();
	}

}
