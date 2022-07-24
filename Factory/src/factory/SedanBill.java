package factory;

public class SedanBill extends Bill {
	
	@Override
	void getVehicleData() {
		// 100 SDG Per 1 KM
		rate=100;
		name="Sedan";
	}
}