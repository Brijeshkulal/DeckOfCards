public class Main {
	public static void main(String[] args) {
		DeckOfCards distributeCards = new DeckOfCards();
			for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
				distributeCards.DistributeCards(playerNumber);
				System.out.println("Player "  + playerNumber);
				distributeCards.print(playerNumber);
			}
	}
}

