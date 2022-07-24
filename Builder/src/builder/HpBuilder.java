package builder;

//The concrete builder class that assembles the parts of the finished HP Laptop object

public class HpBuilder implements LaptopBuilder {

	private Laptop laptop;

	public HpBuilder() {
		this.laptop = new Laptop();
	}

	public void buildLaptopBrand() {
		laptop.setBrand("HP");
	}

	public void buildLaptopOperatingSystem() {
		laptop.setOperatingSystem("Windows 10");
	}

	public void buildLaptopProcessor() {
		laptop.setProcessor("Intel  Core i7");
	}

	public void buildLaptopRam() {
		laptop.setRam("8 GB");
	}

	public void buildLaptopGpu() {
		laptop.setGPU("Intel UHD Graphics 620");
	}

	public void buildLaptopPrice() {
		laptop.setPrice("$ 799");
	}

	public Laptop getLaptop() {
		return this.laptop;
	}

}
