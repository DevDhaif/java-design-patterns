package factory;
import java.io.*;


public class GenerateBill {

	public static void main(String[] args  ) throws IOException {

		// Create object of GetBill Class
		GetBill rideBill=new GetBill();
		
		// Get the vehicle type
		System.out.println("Choose the vehicle type:"
				+ " \n1-Sedan.\n"
				+ "2-Motorcycle\n"
				+ "3-Van");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vehicleType=Integer.parseInt(br.readLine());
		
		// Get the distance
		System.out.println("\nEnter the distance in KM : ");
		double distance=Double.parseDouble(br.readLine());
		
		Bill b=rideBill.getBill(vehicleType);
		
		b.getVehicleData();
		b.calculateBill(distance);
	}

}
