import java.io.Serializable;

public class Magazine extends GameObject implements Buyable {

	String name;
	int pageCount;
	double price;
	
	public Magazine(double price) {
		if (Buyable.isValidPrice(price)) {
			this.price = price;
		} else {
			System.out.println("price is not valid");
		}
	}
	@Override
	public double price() {
		return price;
	}

}
