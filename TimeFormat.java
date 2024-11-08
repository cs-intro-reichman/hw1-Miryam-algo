// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String minutes = ("" + args[0].charAt(3) + args[0].charAt(4));
		if (hours==12){
			System.out.print(hours);
			System.out.print(":");
			System.out.print(minutes);
			System.out.print(" PM");
		}
		else{
			if (hours<12){
				System.out.print(hours);
				System.out.print(":");
				System.out.print(minutes);
				System.out.print(" AM");
			}
			else{
				hours = (hours-12);
				System.out.print(hours);
				System.out.print(":");
				System.out.print(minutes);
				System.out.print(" PM");
			}
		}
	}
}