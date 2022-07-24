package adapter.animals;

public class RoyalPalmTurkey implements ITurkey {
    @Override
    public String fly() {
        return "Fly little";
    }

    @Override
    public String gobble() {
    	return "Makes a gobbling noise";
        // Makes a gobbling noise.
    }
}