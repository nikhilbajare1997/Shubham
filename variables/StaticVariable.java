package variables;
// static and non static both are present
public class StaticVariable {

	int a = 12 ;
	static int v = 100;
	
	public static void m1() {
		StaticVariable a = new StaticVariable();
		StaticVariable b = new StaticVariable();
		System.out.println(a.a);
		a.a=a.a+5;
		System.out.println(a.a);
		
		System.out.println(b.a);  // object wise value change in non static variable
		
		System.out.println(v);
		v = v-49;
		System.out.println(v);
		System.out.println(a.v); // change value apply all in static variable
		System.out.println(b.v);
		
		
	}
	
	public  void m2() {
		int a = 22;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(v);
		System.out.println(this.v);
	}
	public static void main(String[] args) {
		m1();
		StaticVariable b = new StaticVariable();
				b.m2();
		
	}
}
