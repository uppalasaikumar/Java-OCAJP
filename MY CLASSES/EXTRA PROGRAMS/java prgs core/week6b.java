/*****************************************************************

  ROLL NUMBER: 07AT1A1210			DATE: 30-1-2009
  NAME: K.SREEKALA				EXERCISE NUMBER: 6(b)

  TITLE: DEVELOP AN APPLET THAT RECEIVES AN INTEGER IN ONE TEXT FIELD AND COMPUTES ITS FACTORIAL VALUE AND RETURNS IT IN ANOTHER TEXT FIELD WHEN THE BUTTON NAMED “COMPUTE” IS CLICKED.

****************************************************************/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="week6b" width=600 height=600>
</applet>*/

public class week6b extends Applet implements ActionListener
{
  String msg=" ";
  TextField t1,t2;
  Button b1;
  public void init()
  
  {
    
      Label number=new Label("enter a number",Label.RIGHT);
      Label result=new Label("result:",Label.RIGHT);
      t1=new TextField(20);
      t2=new TextField(20);
      b1=new Button("ok");
      add(number);
      add(t1);
      add(result);
      add(t2);
      add(b1);
      b1.addActionListener(this);
  }
 



 public void actionPerformed(ActionEvent e)
  {
    int number1,fact=1;
    String str;
    number1=Integer.parseInt(t1.getText());
    for(int i=number1;i>0;i--)
      fact*=i;
    StringBuffer sb=new StringBuffer(40);
    str=sb.append("fact=").append(fact).toString();
    t2.setText(str);
   }
   public void paint(Graphics g)
   {
     setBackground(Color.green);
   }
}





