package adapter.animals;

public class TurkeyAdapter implements IDuck {
    private IDuck duck;

    public TurkeyAdapter(ITurkey turkey) {
        this.duck = (IDuck) turkey;
    }

    @Override
    public String fly() {
        return duck.fly();
    }

    @Override
    public String quack() {
        return  duck.quack();
    }
}