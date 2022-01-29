package trainee;

public class Mobile {

	String modelname;
	String processor;
	String ram;
	int price;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(String modelname, String processor, String ram, int price) {
		
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [modelname=" + modelname + ", processor=" + processor + ", ram=" + ram + ", price=" + price
				+ "]";
	}

}
