package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace", "jack", "king"};
		String[] suits = {"club", "diamond", "heart"};
		int[] values = {11, 12, 13};
		Deck2 deck = new Deck2(ranks, suits, values);
		System.out.println(deck.toString());
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
		System.out.println(deck.deal());
	}
}
