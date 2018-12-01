
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class menuex extends Frame implements ActionListener
{
        MenuBar mbar;
        Menu mnu;
        MenuItem mitem;
        public menuex()
        {
                mbar=new MenuBar();
                setMenuBar(mbar);
                mnu=new Menu("Item Details");
                mbar.add(mnu);
                mitem=new MenuItem("Item Code");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Item Name");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Quantity");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Price");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Supplier Code");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Supplier Name");
                mnu.add(mitem);
                mitem.addActionListener(this);
                setSize(700,500);
                setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                Dia d;
                if(ae.getActionCommand().equals("Item Code"))
                {
                        d=new Dia(this,"It is the Item Code");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Item Name"))
                {
                        d=new Dia(this,"It is the Item Name");
                        d.setLocation(300,200);


                }
                if(ae.getActionCommand().equals("Quantity"))
                {
                        d=new Dia(this,"It is the Quantity");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Price"))
                {
                        d=new Dia(this,"It is the Price");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Supplier Code"))
                {
                        d=new Dia(this,"It is the Supplier Code");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Supplier Name"))
                {
                        d=new Dia(this,"It is the Supplier Name");
                        d.setLocation(300,200);

                }
        }
        public static void main(String ar[])
        {
                new menuex();
        }
}
class Dia extends Dialog implements ActionListener
{
        Button b1;
        Label l1;
        public Dia(Frame f,String s)
        {
                super(f,s);
                setLayout(null);
                l1=new Label(s);
                b1=new Button("Ok");

                l1.setBounds(20,30,150,20);
                b1.setBounds(70,70,50,20);
                add(l1);
                add(b1);
                b1.addActionListener(this);
                setSize(300,100);
                setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                dispose();
        }
}
