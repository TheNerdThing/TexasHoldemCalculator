package texas_holdem_calc.Logic;

import texas_holdem_calc.GUI.ResultsPane;

public class CalcResults {

	
	public void calcResults()   {
		return ;
	}
	
	private static Object[][] results(Hand[] hand, Card[] board ){
		Object[][] give = new Object[1][2];
		give[0][0] = "title will go in this row";
		give[0][1] = "result of calc will go here";
		
		return give; 
	}
	
	public static void calcResults(Hand[] hand, Card[] board, ResultsPane rp) {
		String[] test = new String[2];
		test[0] = "i guess somthing has to go here? ";
		test[1] = "im not realy sure i think i need to read about JTables";
		rp.updateTable(results(hand, board), test);
	}
}
