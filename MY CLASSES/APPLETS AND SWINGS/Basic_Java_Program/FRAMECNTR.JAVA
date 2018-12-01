import java.awt.*;
import java.awt.event.*;
public class framecntr extends Frame implements ActionListener
{
        TextField t1,t2,t3,t4,t5;
        Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
        Checkbox c,c1,c2,c3,c4;
        CheckboxGroup cg1;
        List ll1;
        Font f1,f2;
        Choice ch1;
        Button b1;
        public framecntr()
        {
                setLayout(null);
                f1=new Font("Sans Serif",Font.BOLD,25);
                f2=new Font("Sans Serif",Font.BOLD,15);
                l1=new Label("Employee ID :");
                l2=new Label("Employee Name :");
                l3=new Label("Age :");
                l4=new Label("Designation :");
                l5=new Label("Grade :");
                l6=new Label("Gender :");
                l7=new Label("Basic Pay");
                t1=new TextField();
                t2=new TextField();
                t3=new TextField();
                b1=new Button("Click");
                ll1=new List(3);
                cg1=new CheckboxGroup();
                c2=new Checkbox("A");
                c3=new Checkbox("B");
                c4=new Checkbox("C");
                ch1=new Choice();
                for(int i=20;i<=60;i++)
                {
                        ch1.add(""+i);
                }
                ll1.add("Manager");
                ll1.add("Clerk");
                ll1.add("Lecturer");
                ll1.add("S/W Engineer");
                ll1.add("H/W Engineer");
                b1.addActionListener(this);
                c=new Checkbox("Female",cg1,false);
                c1=new Checkbox("Male",cg1,false);
                l=new Label("PayRoll System");
                l.setBounds(300,20,200,40);
                l1.setBounds(200,70,150,20);
                t1.setBounds(400,70,100,20);
                l2.setBounds(200,110,150,20);
                t2.setBounds(400,110,100,20);
                l3.setBounds(200,160,150,20);
                ch1.setBounds(400,160,100,20);
                l4.setBounds(200,200,150,20);
                ll1.setBounds(400,200,150,25);
                l5.setBounds(200,250,150,20);
                c2.setBounds(400,250,40,20);
                c3.setBounds(460,250,40,20);
                c4.setBounds(520,250,40,20);
                l6.setBounds(200,290,150,20);
                c.setBounds(400,290,90,20);
                c1.setBounds(510,290,90,20);
                l7.setBounds(200,350,150,20);
                t3.setBounds(400,350,100,20);
                b1.setBounds(350,390,100,20);
                ll1.setFont(f2);
                l.setFont(f1);
                l1.setFont(f2);
                l2.setFont(f2);
                l3.setFont(f2);
                l4.setFont(f2);
                l5.setFont(f2);
                l6.setFont(f2);
                l7.setFont(f2);
                t1.setFont(f2);
                t2.setFont(f2);
                t3.setFont(f2);
                c1.setFont(f2);
                c2.setFont(f2);
                c3.setFont(f2);
                c.setFont(f2);
                c4.setFont(f2);
                ch1.setFont(f2);
                b1.setFont(f2);
               add(l1);add(t1);add(ch1);
               add(c1);add(c);add(ll1);add(c2);
               add(c3);add(c4);add(t2);add(t3);
               add(l2);add(l);add(l3);add(l4);add(l5);
               add(l6);add(l7);add(b1);
        }
        public void actionPerformed(ActionEvent ae)
        {
                int basic=Integer.parseInt(t3.getText());
                int hra=(15*basic)/100;
                int ta=(10*basic)/100;
                int da=(12*basic)/100;
                int tax=(4*basic)/100;
                int grosspay=basic+hra+ta+da;
                int netpay=grosspay-tax;
                l8=new Label("HRA :"+hra);
                l9=new Label("TA :"+ta);
                l10=new Label("DA :"+da);
                l11=new Label("GrossPay :"+grosspay);
                l12=new Label("Tax :"+tax);
                l13=new Label("NetPay :"+netpay);
                l8.setFont(f2); l9.setFont(f2);  l10.setFont(f2);
                l11.setFont(f2); l12.setFont(f2);l13.setFont(f2);
                l8.setBounds(200,430,100,20);
                l9.setBounds(350,430,100,20);
                l10.setBounds(500,430,100,20);
                l11.setBounds(200,460,150,20);
                l12.setBounds(350,460,100,20);
                l13.setBounds(500,460,120,20);
                add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);
            }
            public static void main(String ar[])
            {
                    framecntr p=new framecntr();
                    p.setSize(800,600);
                    p.setVisible(true);
            }
 }
