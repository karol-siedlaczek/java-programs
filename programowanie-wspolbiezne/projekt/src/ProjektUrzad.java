import java.awt.EventQueue;

public class ProjektUrzad {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MyFrame();
			}
		});
	}
}