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
		Card1 card1 = new Card1("Ace", "Spades", 1);
		Card1 card2 = new Card1("Jack", "Hearts", 5);
		Card1 card3 = new Card1("King", "Diamonds", 10);
		System.out.println("Card 1: " + card1);
		System.out.println("Card 2: " + card2);
		System.out.println("Card 3: " + card3);
		System.out.println("Does Card 1 matches Card 2: " + card1.matches(card2));
		System.out.println("Does Card 2 matches Card 3: " + card2.matches(card3));
		System.out.println("Does Card 1 matches Card 1: " + card1.matches(card1));
	}
}
