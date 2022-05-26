import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame() {
		
		this.add(new GamePanel());
		this.setTitle("Super Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
		this.setIconImage(new ImageIcon("snake_logo.jpg").getImage());
	}
}
