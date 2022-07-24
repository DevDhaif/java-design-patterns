package builder;

public class TestLaptopBuilder {

	public static void main(String[] args) {

		// Get a LaptopBuilder of type HpBuilder
		LaptopBuilder hpBuilder = new HpBuilder();
		// Get a LaptopBuilder of type DellBuilder
		LaptopBuilder dellBuilder = new DellBuilder();

		// Pass the HpBuilder specification to the director
		LaptopDirector hpMaker = new LaptopDirector(hpBuilder);
		// Pass the DellBuilder specification to the director
		LaptopDirector dellMaker = new LaptopDirector(dellBuilder);

		// Tell the director to make the Laptop using the specifications of the HpBuilder class
		hpMaker.makeLaptop();
		// Tell the director to make the Laptop using the specifications of the DellBuilder class
		dellMaker.makeLaptop();

		// The director returns the right laptop based on the specs sent to it on line 13
		Laptop hpLaptop = hpMaker.getLaptop();
		// The director returns the right laptop based on the specs sent to it on line 15
		Laptop dellLaptop = dellMaker.getLaptop();

		// Print out all the data for the created objects:
		hpLaptop.getRobotData();
		dellLaptop.getRobotData();

	}

}
