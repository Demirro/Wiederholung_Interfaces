
public class Application {

	public static void main(String[] args) {
		Magazine m1 = new Magazine(11.00);
		Chocolate c1 = new Chocolate();
		Water w1 = new Water();
		
		Player p1 = new Player();
		
		//System.out.println(Buyable.isValidPrice(m1.price()));
		System.out.println(m1.price());
		
		if (m1 instanceof Eatable) {
			System.out.println(m1 + " is GameObject");
		} else {
			System.out.println(m1 + " is not an instance of...");
		}
	}

}