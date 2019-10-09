package texas_holdem_calc.GUI;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

import texas_holdem_calc.Logic.CalcResults;

public class GUILogic extends JFrame {
	private final int STARTING_HIGHT = 1000;
	private final int STARTING_WIDTH = 1000;
	private final int MAX_CARDS_ON_BOARD = 5;
	private final int X_STARTING_POSTION = 500;
	private final int Y_STARTING_POSTION = 500;
	
	CardSelector boardSelector;
	HandSelector handSelector;
	ResultsPane rp; 
	CalcResults cr; 
	JTabbedPane tp;
	
	public GUILogic()  {
		boardSelector = new CardSelector(MAX_CARDS_ON_BOARD, STARTING_HIGHT,STARTING_WIDTH,X_STARTING_POSTION,Y_STARTING_POSTION); 
		handSelector = new HandSelector(STARTING_HIGHT, STARTING_WIDTH, X_STARTING_POSTION, Y_STARTING_POSTION);
		rp = new ResultsPane();
		cr = new CalcResults();
		tp = new JTabbedPane();
		
		tp.addTab("Hand Selctor", handSelector);
		tp.addTab("Board Selctor", boardSelector);
		tp.addTab("Results",rp);
		CalcResults.calcResults(null,null, rp);
		this.setSize(STARTING_HIGHT, STARTING_WIDTH);
		this.add(tp);
		this.setVisible(true);
	}


}
