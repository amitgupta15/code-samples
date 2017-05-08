package recursion;

public class Recursion {

	public int factorial(int n) throws IllegalArgumentException{
		if(n < 0) throw new IllegalArgumentException();
		if(n == 0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}

}