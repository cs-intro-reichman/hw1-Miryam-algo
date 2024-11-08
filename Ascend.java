// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*(lim+1));
		int b = (int)(Math.random()*(lim+1));
		int c = (int)(Math.random()*(lim+1));
		System.out.println (a +" "+ b+" "+c);
		int mini = Math.min(a,b);
		mini = Math.min(mini,c);
		int maxi = Math.max(a,b);
		maxi = Math.max(maxi,c);
		int mid =  a+b+c-mini-maxi;
		System.out.println(mini + " "+ mid+ " "+maxi);
	}
}
