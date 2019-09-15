import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int divisions = 6;
		int quarters = 4;
		double sum = 0;
		double avg = 0;
		int highest = 0;
		int div = 0;
		int vary = 0;
		double varySums = 0;
//		int sales[][] = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}};
		int sales[][]= new int[divisions][quarters];
		double sums[] = new double[quarters];
		double avgs[] = new double[quarters];
		int highests[] = new int[quarters];
		int divs[] = new int[quarters];

		for (int i = 0; i < quarters; i++) {
			for (int j = 0; j < divisions; j++) {
				System.out.println("Enter sales for quarter: "+(i+1)+" division: "+(j+1));
				sales[j][i] = input.nextInt();
			}
		}
		System.out.println("\n*****************************************************");
		System.out.println("******************** RESULTS ************************");
		System.out.println("*****************************************************\n");

		System.out.println("************** Sales By Division *****************");
		
		for (int i = 0; i < divisions; i++) {
			for (int j = 0; j < quarters; j++) {
				System.out.println("Sales of division "+(i+1)+", Quarter "+(j+1)+": $"+sales[i][j]);
			}
			System.out.println();
		}

		for(int i = 0; i < quarters; i++) {
			sum = 0;
			for(int j = 0; j < divisions; j++) {
				sum += sales[j][i];
				sums[i] = sum;
				if (sales[j][i]>highest) {
					highest = sales[j][i];
					highests[i] = highest;
					div = j+1;
					divs[i] = div;
				}
			}

			avg = sum/divisions;
			avgs[i] = avg;
		}
		
		System.out.println("****** Increase/Decrease From Previous Quarter *********");
		for (int i=0; i<divisions; i++ ) {
			for (int j=1; j<quarters; j++) {
				vary = sales[i][j]-sales[i][j-1];
				if (vary > 0) {
					System.out.println("Division " +(i+1)+":: Quarter "+(j+1)+ " increased from Quarter "+ (j)+" by: $"+vary);
				}
				else if (vary < 0) {
					System.out.println("Division " +(i+1)+":: Quarter "+j+ " decreased from Quarter "+ (j+1)+" by: $"+Math.abs(vary));
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("************ Total Sales for Quarter **************");
		for (int i = 0; i < sums.length; i++) {
			System.out.println("Total sales of quarter "+(i+1)+": $"+sums[i]);
		}
		System.out.println();
		
		System.out.println("****** Increase/Decrease From Previous Quarter *********");
		for (int i = 1; i < sums.length; i++) {
			varySums = sums[i]-sums[i-1];
			if (varySums > 0) {
				System.out.println("Quarter "+(i+1)+ " increased from Quarter "+ (i)+" by: $"+varySums);
			}
			else if (varySums < 0) {
				System.out.println("Quarter "+i+ " decreased from Quarter "+ (i+1)+" by: $"+Math.abs(varySums));
			}
		}
		System.out.println();
		
		System.out.println("********** Average Sales for Quarter **************");
		for (int i = 0; i < avgs.length; i++) {
			System.out.println("Average sales of quarter "+(i+1)+": $"+avgs[i]);
		}
		System.out.println();
		
		System.out.println("************ Highest Sale for Quarter **************");
		for (int i = 0; i < highests.length; i++) {
			System.out.println("Division "+divs[i]+" has highest sale for Quarter "+(i+1)+" with sales of: $"+highests[i]);
		}
		System.out.println();
		
	}
}

