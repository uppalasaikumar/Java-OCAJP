import java.util.*;
public class MyVector {
	public Vector myVector () {
		Vector v = new Vector(3);
		v.addElement("Adding element to vector");
		Stack stk = new Stack();
		stk.push(2);
		stk.push(5.7);
		stk.push('s');
		System.out.println(stk);
		v.addAll(stk);
		v.addElement(true);
		return v;
	}
	public static void main ( String [] args) {
		MyVector mv = new MyVector();
		System.out.println(mv.myVector());
	}
}