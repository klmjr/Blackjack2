package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eRank eRank;
	private eSuit eSuit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card (eRank eRank, eSuit eSuit) {
		
		this.eRank = eRank;
		this.eSuit = eSuit;
		
	}
	public Card(eSuit eSuit, eRank eRank) {
		
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	public eRank geteRank() {
		return eRank;
	}
	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}
	public void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	public eSuit geteSuit() {
		return eSuit;
	}
	
	@Override
	public int compareTo(Object arg0) {
		Card c1 = (Card)arg0;
		if (this.geteRank().getiRankNbr() == c1.geteRank().getiRankNbr());
			return this.geteRank().getiRankNbr() - c1.geteRank().getiRankNbr();
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
