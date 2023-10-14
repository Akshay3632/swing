package Swing;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class PanelTest extends JFrame {
	private JButton b,b1,b2;
	
	private  JLabel l;
	public PanelTest()
	{
		l = new JLabel("panel label");
		b= new JButton("button 1");
		b1= new JButton("button 2");
		b2= new JButton("button 3");
		
		JPanel p = new JPanel();
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(l);
		p.setBackground(Color.orange);
		add(p);
		setSize(300,300);
		show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 PanelTest p =new PanelTest();
	}

}
