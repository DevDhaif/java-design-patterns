package adapter.animals;

public class MainClass {
	public static void main(String[] args) {
		IDuck mallardDuck = new MallardDuck();
//		mallardDuck.fly();
//		mallardDuck.quack();
		ITurkey turkey = new RoyalPalmTurkey();

//		System.out.println(turkey.gobble());
		turkey.fly();

		IDuck adapteeTurkey = new TurkeyAdapter(turkey);
		System.out.println(adapteeTurkey.fly());
//		duck.quack();
//		duck.fly();
	}
}
