
public interface Buyable {
	double MAX_PRICE = 10.00;
	
	static boolean isValidPrice(double price) {
		return price >= 0 && price < MAX_PRICE;
	}
	
	public double price();
}
