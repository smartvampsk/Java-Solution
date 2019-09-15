import java.util.Scanner;

public class RainfallCalculation {

	public static void main(String[] args) {
		int year = 0;
		int month = 12;
		boolean positive_year= false;
		double rainfall;
		double totalrainfall = 0;
		double avgrainfall = 0;
		int totalMonth= 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Years: ");
		while(positive_year == false) {
			year = input.nextInt();
			if (year<1) {
				positive_year = false;
				System.out.println("Year cannot be negative or null. Please enter positive value for year:");
			}
			else {
				positive_year = true;
			}
		}

		for (int i = 1; i <= year; i++) {
			for (int j = 1; j <= month; j++) {
				System.out.println("Enter rainfall inch for Year "+i+", month "+j+": ");
				rainfall = input.nextInt();
				totalrainfall += rainfall;
			}
		}
		totalMonth = year*12;
		avgrainfall = totalrainfall/totalMonth;
		System.out.println("\n\n****************** RESULTS *******************************");
		System.out.println("\nTotal month is: " +totalMonth);
		System.out.println("Total rainfall is: " +totalrainfall);
		System.out.println("Average rainfall per month is: " +avgrainfall);
	}
}