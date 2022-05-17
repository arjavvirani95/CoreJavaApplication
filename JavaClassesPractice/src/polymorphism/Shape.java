package polymorphism;

class Shape { //Super Class
	
	void draw() {
		System.out.println("Can not say shape type");
	}
}
class Square extends Shape { //SubClass With Inheritance
	
	//@Override
	void draw2() {	//Sub class
		super.draw();	//Call super class method with sub class object
		System.out.println("shape sqaure");
	}
}

class Demo {
	public static void main(String[] args) {
		Shape r = new Square();
		r.draw();	//Call method by subclass object and super class reference
	}
}