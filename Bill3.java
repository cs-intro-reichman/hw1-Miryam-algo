// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// enter 3 names
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// enter the bill
		int devidedpayment = Integer.parseInt(args[3]);
		devidedpayment = (int)Math.ceil(devidedpayment/3.0);
		System.out.println ("Dear " + name1 + ", " + name2 + ", and "+ name3 + ": pay " + (double)devidedpayment + " Shekels each");
	    // 
	}
}
