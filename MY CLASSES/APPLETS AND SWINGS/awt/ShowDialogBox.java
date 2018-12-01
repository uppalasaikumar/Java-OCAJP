import javax.swing.*;
import java.awt.event.*;
public class ShowDialogBox 
implements ActionListener
	{
	JFrame frame;
	public ShowDialogBox()
		{
frame = new JFrame("Show Message Dialog");
JButton button = new JButton("Click Me");
	button.addActionListener(this);
		frame.add(button);
		frame.setSize(400, 400);
		frame.setVisible(true);
frame.setDefaultCloseOperation
	(JFrame.EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
	{
JOptionPane.showMessageDialog
	(frame,"Naresh.com");
		}
	public static void main(String[] args)
		{
ShowDialogBox db = new ShowDialogBox();
	}
}