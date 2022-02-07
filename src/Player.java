
public class Player {
	
	private double funds = 2.00;

	public void buyGameObject(Buyable buyable) {
		if (funds >= buyable.price()) {
			System.out.println("The player bought the item " + buyable.getClass().getSimpleName());
		} else {
			System.out.println("The player has not enough money to buy the item");
		}
	}
}