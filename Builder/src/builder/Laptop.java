package builder;

//The concrete Laptop class based on the LaptopPlan interface
public class Laptop implements LabtopPlan {
	private String laptopOperatingSystem;
	private String laptopBrand;
	private String laptopProcessor;
	private String laptopRam;
	private String laptopGpu;
	private String laptopPrice;

	public void setOperatingSystem(String operatingSystem) {
		laptopOperatingSystem = operatingSystem;
	}

	public String getLaptopOperatingSystem() {
		return laptopOperatingSystem;
	}

	public void setBrand(String brand) {
		laptopBrand = brand;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setProcessor(String processor) {
		laptopProcessor = processor;
	}

	public String getLaptopProcessor() {
		return laptopProcessor;
	}

	public void setRam(String ram) {
		laptopRam = ram;
	}

	public String getLaptopRam() {
		return laptopRam;
	}

	public void setGPU(String gpu) {
		laptopGpu = gpu;
	}

	public String getLaptopGPU() {
		return laptopGpu;
	}

	public void setPrice(String price) {
		laptopPrice = price;
	}

	public String getLaptopPrice() {
		return laptopPrice;
	}

	public void getRobotData() {
		System.out.println("Brand : " + laptopBrand + "\n" + "OS : " + laptopOperatingSystem + "\n" + "Processor : "
				+ laptopProcessor + "\n" + "RAM : " + laptopRam + "\n" + "GPU : " + laptopGpu + "\n" + "Price : "
				+ laptopPrice + "\n");
	}
}