import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		super("Urzad placenia podatkow \"Krzak enterprise\"");
		JPanel panel = new MyPanel();
		setResizable(false);
		add(panel);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}