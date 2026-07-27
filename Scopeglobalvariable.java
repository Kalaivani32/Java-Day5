
public class Scopeglobalvariable {
	int a= 10;
	void m1() {
		System.out.println(a);
	}
	  void m2() {
		  System.out.println(a);
	  }

	public static void main(String[] args) {
		Scopeglobalvariable s = new Scopeglobalvariable();
		 s.m1();
		 s.m2();
	

	}

}
