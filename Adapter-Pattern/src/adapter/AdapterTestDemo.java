package adapter;

public class AdapterTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IImperial averageAmercanKg = new AverageManKg();
		IMetric averageAmercanLbs = new AverageManLbsAdapter(averageAmercanKg);

		System.out.println("Average Weight for an adult in Metric  : "
				+ averageAmercanKg.getWeight() + " KG");
		System.out.println("Average Weight for an adult in Imperial : "
				+ averageAmercanLbs.getWeight() + " LBS");
	}

}
