package adapter;

public class CircleAdaptor extends Circle implements Shape {
	@Override
    public double calculateArea(int r) {
        return  calculateCircularArea(r);
    }
}
