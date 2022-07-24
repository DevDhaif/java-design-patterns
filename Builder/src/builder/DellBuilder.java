package builder;

//The concrete builder class that assembles the parts of the finished Dell Laptop object

public class DellBuilder implements LaptopBuilder {
	private Laptop laptop;

	public DellBuilder() {
		this.laptop = new Laptop();
	}

	public void buildLaptopBrand() {
		laptop.setBrand("DELL");
	}

	public void buildLaptopOperatingSystem() {
		laptop.setOperatingSystem("ChromeOS");
	}

	public void buildLaptopProcessor() {
		laptop.setProcessor("Intel  Core i5");
	}

	public void buildLaptopRam() {
		laptop.setRam("4 GB");
	}

	public void buildLaptopGpu() {
		laptop.setGPU("AMD Radeon RX 570");
	}

	public void buildLaptopPrice() {
		laptop.setPrice("$ 499");
	}

	public Laptop getLaptop() {
		return this.laptop;
	}
}
