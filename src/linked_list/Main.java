package linked_list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkedList = new LinkedList(0);
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		
		myLinkedList.set(2, 4);
		
		myLinkedList.insert(2, 5);
		myLinkedList.remove(2);
		
		myLinkedList.printList();
		System.out.println();
		
		System.out.println(myLinkedList.get(1).value);
//		
//		System.out.println("Node removed: " + myLinkedList.removeLast().value);
//		System.out.println("Node removed: " + myLinkedList.removeLast().value);
//		
//		myLinkedList.prepend(9);
//		System.out.println("Node removed: " + myLinkedList.removeFirst().value);
//		System.out.println("Node removed: " + myLinkedList.removeFirst().value);

		
		myLinkedList.printList();
	}

}
