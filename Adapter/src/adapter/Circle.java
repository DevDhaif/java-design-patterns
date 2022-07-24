package adapter;

public class Circle implements Shape {
	public double calculateCircularArea (int r) {
        return 3.14 * r * r;
    }

	@Override
	public double calculateArea(int r) {
		// TODO Auto-generated method stub
		return 3.14 * r * r;
	}
}
