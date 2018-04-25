package p2;
import p1.*;
public class C3 {
	public void foo() {
		C1 obj = new C1();
		int i = obj.i;
		double d = obj.d;
		char c = obj.c;
		obj.setI(0);
		obj.setC('a');
	}
}