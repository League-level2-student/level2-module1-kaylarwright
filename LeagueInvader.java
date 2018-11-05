import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvader {
	final static int x = 500;
	final static int y = 800;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
public static void main(String[] args) {
	LeagueInvader LI = new LeagueInvader();
	LI.setup();
}
LeagueInvader(){
	
	
	}
void setup() {
	
	frame.setSize(x,y);
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}





