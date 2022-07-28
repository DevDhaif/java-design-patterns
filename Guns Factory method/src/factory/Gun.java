package factory;

public class Gun implements Weapon {
	@Override
	public void create() {
		System.out.println("Inside Gun::create() method");
	}
}
