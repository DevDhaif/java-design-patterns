package vbulider;

public abstract class MealBuilder {

	protected Meal meal;

	public abstract void BuildEngine();

	public abstract void BuildBrakingSystem();

	public abstract void BuildBody();

	public abstract void BuildInterior();

	public Meal GetVehicle() {
		return meal;
	}
}
