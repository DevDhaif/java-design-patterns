package factory;

public class VanBill extends Bill{

	@Override
	void getVehicleData() {
		// 150 SDG Per 1 KM
		rate=150;
		name="Van";
	}
}