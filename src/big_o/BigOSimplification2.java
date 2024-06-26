package big_o;

public class BigOSimplification2 {
	
	public static int addItems(int n) {
		return n + n; // O(1)
		// if return n + n + n; -> we can simplify O(2) -> O(1)
		// it means as n grows, the number of operations stays constant
	}
	
	public static void printItems(int a, int b) {
		for (int i = 0; i < a; i++) {
			System.out.println(a); // O(a)
		}
		
		for (int i = 0; i < b; i++) {
			System.out.println(b); // O(b)
		}
		// O(a + b)
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println(a + " " + b);
			}
		} // O(a * b)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addItems(20);
		printItems(10, 20);
	}

}
