package intro_to_array_lists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
Timer time = new Timer(1000/60, this);

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
	
}
 
void startGame() {
	// TODO Auto-generated method stub
time.start();

}
	
}



