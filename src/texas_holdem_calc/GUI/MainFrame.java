package texas_holdem_calc.GUI;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	HandSelector add; 
	
	public MainFrame() {
		this.setBounds(450,10,1000,1000);
		add =  new HandSelector(1000,1000,0,0);
		this.add(add);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public String  printComponets() {
		String give ="";
		for(String i : add.getPressed()) {
			give += i;
		}
		return give;
	}
}
