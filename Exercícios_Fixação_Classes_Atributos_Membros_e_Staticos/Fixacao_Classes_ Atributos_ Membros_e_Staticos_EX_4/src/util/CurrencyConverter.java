package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double convert(double price, double vlrDollar){
		double con = vlrDollar * price;
		return con+=(con*IOF);
	}

}
