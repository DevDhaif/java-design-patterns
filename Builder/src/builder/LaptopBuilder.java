package builder;

//Defines the methods needed for creating specs for the laptop

public interface LaptopBuilder {

	public void buildLaptopOperatingSystem();

	public void buildLaptopBrand();

	public void buildLaptopProcessor();

	public void buildLaptopRam();

	public void buildLaptopGpu();

	public void buildLaptopPrice();

	public Laptop getLaptop();
}
