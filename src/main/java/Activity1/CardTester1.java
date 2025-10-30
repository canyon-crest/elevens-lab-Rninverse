package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Ace", "Spades", 1);
		Card card2 = new Card("Jack", "Hearts", 5);
		Card card3 = new Card("King", "Diamonds", 10);
		System.out.pintln("Card 1: " + card1);
		System.out.pintln("Card 2: " + card2);
		System.out.pintln("Card 3: " + card3);
		System.out.println("Does Card 1 matches Card 2: " + card1.matches(card2));
		System.out.println("Does Card 2 matches Card 3: " + card2.matches(card3));
		System.out.println("Does Card 1 matches Card 1: " + card1.matches(card1));
	}
}
