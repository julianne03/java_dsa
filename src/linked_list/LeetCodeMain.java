package linked_list;

public class LeetCodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList(4);
		
		myList.append(11);
		myList.append(43);
		myList.append(26);
		myList.append(11);
		myList.append(15);
		
		System.out.println(myList.findMiddleNode());
	}

}
