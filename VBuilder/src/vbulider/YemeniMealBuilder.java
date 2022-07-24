package vbulider;

public class YemeniMealBuilder extends MealBuilder {

	public YemeniMealBuilder() {
		meal = new YemeniMeal();
	}

	@Override
	public void BuildEngine() {
		// TODO Auto-generated method stub
		meal.Engine="Yemeni meal engine";
	}

	@Override
	public void BuildBrakingSystem() {
		// TODO Auto-generated method stub
		meal.BrakingSystem="Yemeni meal braking";
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		meal.Body="Yemeni meal body";
	}

	@Override
	public void BuildInterior() {
		// TODO Auto-generated method stub
		meal.Interior="Yemeni meal interior";
	}

}
