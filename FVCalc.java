// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// insert the currentValue, rate and number of years
		double currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1])/100;
		int numYears = Integer.parseInt(args[2]);
		double futureValue;
		futureValue = currentValue * Math.pow(1+rate,numYears);
		System.out.println("After "+numYears+ " years, $"+(int)currentValue+" saved at " +rate*100+"% will yield $"+(int)futureValue);
	}
}