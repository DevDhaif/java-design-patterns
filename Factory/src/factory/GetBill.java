package factory;

class GetBill {

	public Bill getBill(int vehicleType) {
		
		switch (vehicleType) {
		case 1: 
		{
			return new SedanBill();
		}
		case 2: 
		{
			return new MotorCycleBill();
		}
		case 3: 
		{
			return new VanBill();
		}
		default:
		{	
//			throw new IllegalArgumentException("Unexpected value: " 
//					+ vehicleType +" please choose a valid vehicle number");
			
			System.out.println("Please choose a valid vehicle number!");
			return null;
		}
		}
	}
}
