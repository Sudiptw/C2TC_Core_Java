package implementation;

public class Aadhar {
	
	String Aadharno;
	String Address;
	String phoneno;
	
	public Aadhar() {
		// TODO Auto-generated constructor stub
	}

	public Aadhar(String aadharno, String address,String phoneno) {
		super();
		Aadharno = aadharno;
		Address = address;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Aadhar [Aadharno=" + Aadharno + ", Address=" +Address+ ", phoneno=" + phoneno + "]";
	}

	public String getAadharno() {
		return Aadharno;
	}

	public void setAadharno(String aadharno) {
		Aadharno = aadharno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}

