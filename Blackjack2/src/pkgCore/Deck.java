package pkgCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {
	
	

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	public Deck(int iNbrofDecks) throws DeckException  {
	
		if(iNbrofDecks < 1)
			throw new DeckException(this);
		
		for(int a = 0; a < iNbrofDecks; a++) {
			
		
		for(eSuit eSuit: eSuit.values())
		{
			for (eRank eRank: eRank.values())
			{
				cards.add(new Card(eSuit, eRank));
			}
		}
		}
	Collections.shuffle(cards);
	}
	
	


	public Deck() throws DeckException {
		
		this(1);
		
		
	}
	public Card Draw() throws DeckException {
		if(cards.size() == 0)
			throw new DeckException(this);
		return cards.remove(0);
	}
	
	public int getRemaining(Object eNum) {
		int i = 0;
		if(eNum instanceof Deck) {
			i = i + 1;
			
		}
		return i;
	}
}

	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	

