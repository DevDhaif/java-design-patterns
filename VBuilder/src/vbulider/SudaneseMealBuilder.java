package vbulider;

public class SudaneseMealBuilder extends MealBuilder {
	public SudaneseMealBuilder() {
		meal = new SudaneseMeal();
	}

	@Override
	public void BuildEngine() {
		// TODO Auto-generated method stub
		meal.Engine="Sudanese meal engine";
	}

	@Override
	public void BuildBrakingSystem() {
		// TODO Auto-generated method stub
		meal.BrakingSystem="Sudanese meal braking";
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		meal.Body="Sudanese meal body";
	}

	@Override
	public void BuildInterior() {
		// TODO Auto-generated method stub
		meal.Interior="Sudanese meal interior";
	}
}
