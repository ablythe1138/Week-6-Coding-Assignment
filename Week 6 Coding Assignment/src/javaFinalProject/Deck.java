package javaFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Clubs", "Diamonds", "Hearts","Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < numbers.length; i++) {
				String nameOfCard = numbers[i] + " " + suit;
				int valueOfCard = i + 1;
				Card card= new Card(nameOfCard, valueOfCard);
				cards.add(card);
			}
		}
	}

		
	public List<Card> getCards() {
		return cards;
	}


	public void setCards(List<Card> cards) {
		this.cards = cards;
	}


	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}

