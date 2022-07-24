package vbulider;

public class MealMaker {
	private MealBuilder mealBuilder;

	public MealMaker(MealBuilder builder) {
		mealBuilder = builder;
	}

	public void BuildVehicle() 
	{ 
	mealBuilder.BuildEngine(); 
	mealBuilder.BuildBrakingSystem(); 
	mealBuilder.BuildBody(); 
	mealBuilder.BuildInterior(); 
	}
}
