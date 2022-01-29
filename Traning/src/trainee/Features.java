package trainee;

public class Features {

	static Company c = new Company("Motorolafusionone  ", "Snapdragon 730G  ", "8Gb  ", 256);
	static Company c1 = new Company("HOnar9x  ", "Snapdragon320  ", "6Gb  ", 128);
	static Company c2 = new Company("Samsung   ", "aiu  ", "4Gb  ", 64);
	static Company c3 = new Company("oppo   ", "Snap20  ", "6gb  ", 128);
	static Company c4 = new Company("vivo  ", "snapdragon32  ", "6gb  ", 256);

	public static void main(String[] args) {
		companyList(c);
		System.out.println("");
		companyList(c1);
		System.out.println("");
		companyList(c2);
		System.out.println("");
		companyList(c3);

	}

	public static void companyList(Company fe) {
		System.out.println("Modelname:" + fe.getname() + "Processor:" + fe.getProcessor() + "Ram:" + fe.getRam()
				+ "Storagecapacity:" + fe.getStoragecapacity());

	}
}
