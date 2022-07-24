package adapter;

public class TestAdapter {
	
	public static void main(String args[]) {
		System.out.println("HELLO");
		Shape circle = new Circle();
        System.out.println("Circle Area " + circle.calculateArea(5));
        Shape square = new Square();
        System.out.println("Square Area " + square.calculateArea(5));
	}

}
