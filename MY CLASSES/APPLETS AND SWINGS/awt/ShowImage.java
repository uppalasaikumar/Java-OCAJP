import java.awt.*;
import javax.swing.*;
class ShowImage extends JPanel
	 {
  Image image; 
 // Create a constructor
   ShowImage(){
// Load an image file into our 
//Image object. 
  
   image = 
 Toolkit.getDefaultToolkit().
	   getImage("sriram.gif");

  }// close the constructor

 public void paint(Graphics g)
	  {
   // Draw our Image object.
g.drawImage(image,50,10,200,200,this); // at location 50,10
   //50 -->x-axis,10-->y-axis
	 // 200 width and hight
  }//close paint
public static void main(String arg[])
	  {
JFrame frame = 
	new JFrame("ShowImage");
 frame.setDefaultCloseOperation
	 (JFrame.EXIT_ON_CLOSE);
   frame.setSize(600,400);
   frame.setVisible(true);
ShowImage panel = new ShowImage();
//add the panel to frame contentpane
   frame.setContentPane(panel);    
   }
 }