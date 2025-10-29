// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); // nonnegative
        double rate = Double.parseDouble(args[1]); // between 0-100 inclusive
        int n = Integer.parseInt(args[2]); // number of years
        double result = currentValue * Math.pow((1+(rate/100)), n);

        System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate +  "% will yield " + "$" + (int) result);
	}
}