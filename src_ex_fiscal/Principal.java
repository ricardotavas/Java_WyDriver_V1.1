
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Principal {

	public Principal() {
	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new Send();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.addWindowListener(new FrameListener());
				frame.setVisible(true);
			}
		});
	}

	private static class FrameListener extends WindowAdapter {

		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
