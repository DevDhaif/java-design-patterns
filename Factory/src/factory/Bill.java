package factory;

abstract class Bill {
	protected double rate;
	protected String name;
	
	abstract void getVehicleData();
	
	public void calculateBill(double distance) {
		System.out.printf("\n\n=================================\n"
				+ "Your total is :\n %s SDG \n tybe-> %s ",(distance*rate),name);
	}

	

}
