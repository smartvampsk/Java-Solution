import java.text.DecimalFormat;

public class CommissionProfit {

	public static void main(String[] args) {
		
		int shareNumber = 1000;
		double pricePerShareBuy = 32.87;
		double commission = 0.02;
		double pricePerShareSale = 33.92;
		
		double moneyPaid, commissionPaid, soldAmount, commissionPaidSold, profit;
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		moneyPaid = shareNumber * pricePerShareBuy;
		commissionPaid = moneyPaid*commission;
		soldAmount = shareNumber*pricePerShareSale;
		commissionPaidSold = soldAmount*commission;
		profit = soldAmount - commissionPaid - commissionPaidSold;

		System.out.println("Amount of money paid for stock is: $"+moneyPaid);
		System.out.println("Amount of commission paid to broker when buying stock: $"+commissionPaid);
		System.out.println("Amonut of money received after selling stock: $"+soldAmount);
		System.out.println("Amount of commission paid to broker after selling stock: $"+commissionPaidSold);
		if (profit > moneyPaid) {
			profit = profit - moneyPaid;
			System.out.println("Joe earned profit of: $"+profit);
		}
		else {
			profit = moneyPaid - profit;
			System.out.println("Joe lost money on the transaction; Amount of loss is: $"+df2.format(profit));
		}
	}
}
