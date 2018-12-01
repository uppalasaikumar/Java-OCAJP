import java.io.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = fontex.class width = 400 height = 400>
</applet>
*/
public class fontex extends Frame implements MouseListener
{
        Label l1;
        Font f1,f2;
        public fontex()
        {
                setLayout(null);
                l1=new Label("Good Morning");
                f1=new Font("Times Roman",Font.BOLD,12);
                f2=new Font("Times Roman",Font.BOLD,28);
                setSize(800,600);
                setVisible(true);
                addMouseListener(this);
        }
        public void mouseEntered(MouseEvent me)
        {
                l1.setBounds(200,400,400,50);
                add(l1);
                l1.setFont(f2);
                setBackground(Color.yellow);
                l1.setBackground(Color.yellow);
                l1.setForeground(Color.red);
                
        }
        public void mouseExited(MouseEvent me)
        {
                l1.setBounds(200,400,400,50);
                l1.setFont(f1);
                setBackground(Color.pink);
                l1.setBackground(Color.pink);
                l1.setForeground(Color.black);
        }
        public void mouseClicked(MouseEvent me)  { }
        public void mousePressed(MouseEvent me)  { }
        public void mouseReleased(MouseEvent me) { }
        public static void main(String ar[])
        {
                new fontex();
        }
}
                
