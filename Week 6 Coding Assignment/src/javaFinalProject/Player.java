package javaFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand;
	int score;
	String name; 
	
	Player(String name) {
		score = 0;
		this.name = name;
		hand = new ArrayList<>();
		
	}
	
	public List<Card> getHand() {
		return hand;
	}


	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println(name + ":");
		for (Card card : hand) {
		card.describe();	
		}
		System.out.println(name + "current score:" + score);
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		}
	}
	
	public void incrementScore() {
		score ++;
	}
	
	
	}
