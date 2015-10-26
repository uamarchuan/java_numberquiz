package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MovingLabel extends JFrame{
	int x,y; // define the location of a label
	JLabel label; // movable label
	Container container;
	MovingLabel(){
		super("Test a movable label");
		x=y=100;
		label= new JLabel("label relocated");
        Container container= getContentPane();
        setLayout(null); // Turn the layout manager off by setting the layout manager to null, as NormR1 indicated
		container.add(label); // place the label into the container
		label.setBounds(100,100,150,30);//position and sizing the label yourself
		container.addMouseListener(new MouseAdapter(){ // add MouseListener
			public void mouseClicked(MouseEvent e){
				x = e.getX();
				y = e.getY();
				label.setBounds(x,y,150,50); // relocating label. You may also resizing the label by altering the 3rd and 4th arguments
			}
		});
		setSize(900,500);
		setVisible(true);
	}	
	public static void main(String args[]){
		MovingLabel m = new MovingLabel();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}