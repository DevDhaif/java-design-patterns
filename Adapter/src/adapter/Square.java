package adapter;

public class Square implements Shape{
	
	@Override
    public double calculateArea(int r) {
        return (int) r * r;
    }
	
}
