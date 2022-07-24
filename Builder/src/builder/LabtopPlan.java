package builder;

//This is the interface that will be returned from the builder
public interface LabtopPlan {

	public void setOperatingSystem(String operatingSystem);

	public void setBrand(String brand);

	public void setProcessor(String processor);

	public void setRam(String ram);

	public void setGPU(String gpu);

	public void setPrice(String price);
}