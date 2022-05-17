package polymorphism;

class CompileTime {	//Method Overloading, Same Method Name Different Parameter
	
	int add() {
		int a = 10,b=20,c;
		c=a+b;
		return c;	
	}
	
	void add(int x, int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	
	void add(int p, double q) {
		double r;
		r=p+q;
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		CompileTime Ctime = new CompileTime();
		
		int add = Ctime.add();	//Compiler will see which method has what parameter and according to that object will call that method on compile time
		System.out.println(add);
		Ctime.add(100, 300);
		Ctime.add(300, 201.32);
		
		System.out.println("------");
		
		Ctime.add(300, 201.32);
		System.out.println(add);
		Ctime.add(100, 300);



	}
}
