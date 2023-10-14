package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleTest extends JFrame {
	JFrame f;

	SampleTest() {
		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40);
		add(b);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SampleTest();
	}

}
