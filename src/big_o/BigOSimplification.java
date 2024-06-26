package big_o;

public class BigOSimplification {

	public static void printItems(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i + " " + j);
			}
			// nested for loop: O(n^2)
			// The graph is going upward much faster than O(n)
			// If you rewrite the code to decrease number of operations, you can make a huge change in efficiency
			System.out.println(i);
		}
		// single for loop: O(n)
		// And the graph will be proportional
		
		for (int j = 0; j < n; j++) {
			System.out.println(j);
		}
		// two for loops: O(n) + O(n) = O(2n)
		// first simplification rule: drop constant: O(2n) -> O(n)
		
		// nested for loop + single for loop: O(n^2 + n) -> n^2: dominant, n: non-dominant
		// second simplification rule: drop non-dominant: O(n^2 + n) -> O(n^2)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printItems(10);
	}

}
