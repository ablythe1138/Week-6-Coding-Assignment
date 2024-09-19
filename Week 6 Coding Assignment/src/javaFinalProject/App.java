package javaFinalProject;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player playerA = new Player("Player A");
		Player playerB = new Player("Player B");
		
		deck.shuffle();
		
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				playerA.draw(deck);
			} else {
				playerB.draw(deck);
			}
		}
		
		for (int i = 1; i < 26; i++) {
			Card card1 = playerA.flip();
			Card card2 = playerB.flip();
			
			System.out.println("Player A card: " + card1.getName());
			System.out.println("Player B card: " + card2.getName());
			
			if (card1.getValue() > card2.getValue()) {
				playerA.incrementScore();
				System.out.println("This round's winner is Player A");
			} else if (card1.getValue() < card2.getValue()) {
				playerB.incrementScore();
				System.out.println("This round's winner is Player B");
			} else {
				System.out.println("No winner this round");
			}
			
			System.out.println("\nScores: \nPlayer A: " + playerA.getScore() + "\nPlayer B: " + playerB.getScore());
			System.out.println();
		}
		
		System.out.println("Final Score: ");
		System.out.println("Player A: " + playerA.getScore());
		System.out.println("Player B: " + playerB.getScore());
		
		if (playerA.getScore() > playerB.getScore()) {
			System.out.println("PLAYER A WINS!");
		} else if (playerA.getScore() < playerB.getScore()) {
			System.out.println("PLAYER B WINS!");
		}
	}

}


