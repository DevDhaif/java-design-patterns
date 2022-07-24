package factory;

public class MotorCycleBill extends Bill {

	@Override
	void getVehicleData() {
		// 15 SDG Per 1 KM
		rate=15;
		name="MotorCycle";
	}
}