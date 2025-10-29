// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]); // bigger than 1

		int a = (int)(Math.random() * lim); // generates a number that its max value is lim
		int b = (int)(Math.random() * lim); // generates a number that its max value is lim
		int c = (int)(Math.random() * lim); // generates a number that its max value is lim

		int min_of_ab = Math.min(a, b);
		int min = Math.min(min_of_ab, c);

		int max_of_ab = Math.max(a, b);
		int max = Math.max(max_of_ab, c);
		int middle = a + b + c - max - min;

		System.out.println(min + " " + middle + " " + max);
	}
}	
