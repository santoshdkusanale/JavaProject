/**
 * 
 */
package interfacePack.java8docsExample;

/**
 * @author 594524
 *
 */
public class PlayingCard implements Card {
	
	private Card.Rank rank;
	private Card.Suit suit;
	
	

	public PlayingCard(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public void setRank(Card.Rank rank) {
		this.rank = rank;
	}

	public void setSuit(Card.Suit suit) {
		this.suit = suit;
	}

	public boolean equals(Object obj) {
		if( obj instanceof Card) {
			if( ((Card)obj).getRank() == this.rank  &&
					((Card)obj).getSuit() == this.suit) {
				return true;
			}
			else return false;
		}
		else return false;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see interfacePack.java8docsExample.Card#getSuit()
	 */
	@Override
	public Suit getSuit() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interfacePack.java8docsExample.Card#getRank()
	 */
	@Override
	public Rank getRank() {
		// TODO Auto-generated method stub
		return null;
	}

}
