package adapter.animals;

public class MallardDuck implements IDuck {
    @Override
    public String fly() {
    	return ("Duck Fly High");
    }

    @Override
    public String quack() {
    	return ("Duck Make Quack sound");
    }
}