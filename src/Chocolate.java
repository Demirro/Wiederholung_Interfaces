
public class Chocolate extends GameObject implements Buyable, Eatable{

	String brand;
	String flavor;
	int grams;
	
	@Override
	public double price() {
		return 0.79;
	}

	@Override
	public int calories() {
		return 100;
	}
}