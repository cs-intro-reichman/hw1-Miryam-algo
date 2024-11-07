// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int receivedNum = Integer.parseInt(args[0]);
		if (receivedNum<0){
			receivedNum = Math.abs(receivedNum);
		}
		int hunderd = receivedNum/100;
		int ten = (receivedNum%100)/10;
		int one = receivedNum%10;
		System.out.println(hunderd+" hundreds, "+ten+" tens, and "+one+" ones.");
	}
}
