package vbulider;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder yemeniMealBuilder= new YemeniMealBuilder();
		MealMaker maker1=new MealMaker(yemeniMealBuilder);
		maker1.BuildVehicle();
		Meal yemeniMeal=yemeniMealBuilder.GetVehicle();
		yemeniMeal.Drive();
	}

}
