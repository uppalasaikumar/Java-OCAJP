//program that demonstrates JOptionPane
import javax.swing.*;
public class joptiondemo
{
public static void main(String args[])
{
int eno;
String ename;
double basic,hra,da,pf,net;
String s;
s=JOptionPane.showInputDialog("Enter Employee number");
eno=Integer.parseInt(s);
ename=JOptionPane.showInputDialog("Enter Employee name");
s=JOptionPane.showInputDialog("Enter Basic salary");
basic=Double.parseDouble(s);
hra=basic*20/100;
da=basic*10/100;
pf=basic*8/100;
net=(basic+hra+da)-pf;
JOptionPane.showMessageDialog(null,"Employee Number:"+eno+"\nEmployee Name:"+ename+"\nBasic Salary"+basic+"\nHRA:"+hra+"\nDA:"+da+"\nPF:"+pf+"Net Salary:"+net);
}
}
