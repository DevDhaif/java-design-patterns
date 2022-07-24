package adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageManLbsAdapter implements IMetric {
	// Adapter here
	private IImperial britishMan;

	public AverageManLbsAdapter(IImperial british) {
		// TODO Auto-generated constructor stub
		this.britishMan = british;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		double averageWeightLbs = this.britishMan.getWeight() * 2.205;
		BigDecimal bd = new BigDecimal(averageWeightLbs).setScale(2, RoundingMode.HALF_UP);

		double weightRounded = bd.doubleValue();

		return weightRounded;
	}

}
