package texas_holdem_calc.Logic;

import texas_holdem_calc.GUI.SelectorSuper;
import texas_holdem_calc.GUI.SelectorSuper.Rank;

public class Hand {

	SelectorSuper.Rank rankOne; 
	SelectorSuper.Rank rankTwo; 
	boolean suited;
	/**
	 * @return the rankOne
	 */
	public SelectorSuper.Rank getRankOne() {
		return rankOne;
	}
	/**
	 * @return the rankTwo
	 */
	public SelectorSuper.Rank getRankTwo() {
		return rankTwo;
	}
	/**
	 * @return the suited
	 */
	public boolean isSuited() {
		return suited;
	}
	/**
	 * @param rankOne
	 * @param rankTwo
	 * @param suited
	 */
	public Hand(Rank rankOne, Rank rankTwo, boolean suited) {
		super();
		this.rankOne = rankOne;
		this.rankTwo = rankTwo;
		this.suited = suited;
	}
	
	/** 
	 * 
	 * @return how many combos of a hand there are
	 */
	public int numberOfCombos() {
		if(rankOne == rankTwo) {
			// there are 6 combos of pairs if no cards are dead
			return 6;
		}
		// if the hand is suited then there are 4 combos of the hand. 12 if they are unsuited
		return suited? 4:12;
	}	
	
	
}
