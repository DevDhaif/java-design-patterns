package builder;

//The director class creates a Laptop using the builder interface that is defined (HpBuilder/DellBuilder)

public class LaptopDirector {
	private LaptopBuilder laptopBuilder;

	// HpBuilder specification is sent to the Director

	public LaptopDirector(LaptopBuilder laptopBuilder) {
		this.laptopBuilder = laptopBuilder;
	}

	// Return the Laptop made from the (HpBuilder/DellBuilder) specs

	public Laptop getLaptop() {
		return this.laptopBuilder.getLaptop();
	}

	// Execute the methods specific to the LaptopBuilder that implements
	// LaptopBuilder (HpBuilder/DellBuilder)
	public void makeLaptop() {
		this.laptopBuilder.buildLaptopBrand();
		this.laptopBuilder.buildLaptopOperatingSystem();
		this.laptopBuilder.buildLaptopProcessor();
		this.laptopBuilder.buildLaptopRam();
		this.laptopBuilder.buildLaptopGpu();
		this.laptopBuilder.buildLaptopPrice();
	}
}
