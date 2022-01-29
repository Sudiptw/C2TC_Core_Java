package trainee;

public class Company {

	String Modelname;
	String Processor;
	String Ram;
	int Storagecapacity;

	public Company(String m, String p, String r, int s) {

		Modelname = m;
		Processor = p;
		Ram = r;
		Storagecapacity = s;

	}

	public String getname() {
		return Modelname;
	}

	public String getProcessor() {
		return Processor;
	}

	public String getRam() {
		return Ram;
	}

	public int getStoragecapacity() {
		return Storagecapacity;
	}

	public static void showCompany(Company Fe) {
		System.out.println(" Modelname : " + Fe.Modelname + " Processor :" + Fe.Processor + " Ram :" + Fe.Ram
				+ " Storagecapacity :" + Fe.Storagecapacity);

	}
}
