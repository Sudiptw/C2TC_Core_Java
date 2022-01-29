package implementation;

public class Studentdetail {
	
	String name;
	String id;
	String Aadharno;
	String Address;
	String phoneno;
	int pancardno;
	String panno;
	float Dob;
	
	public static void main(String[] args) {
		Aadhar a1=new Aadhar("665923653369","Ganesh panchami society sector 23 koper khairne","8693075950");
		Pan p1= new Pan(569558965,"abc869304952",02/01/2001);
		Studentdetail s1=new Studentdetail("sudiptwaykar","sudiptwaykar2325@gmail,com");
		System.out.println(s1);
		
	}
	public Studentdetail() {
		// TODO Auto-generated constructor stub
	}
	public Studentdetail(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Studentdetail [name=" + name + ", id=" + id + ", Aadharno=" + Aadharno + ", Address=" + Address
				+ ", phoneno=" + phoneno + ", pancardno=" + pancardno + ", panno=" + panno + ", Dob=" + Dob + "]";
	}
	
	
	

}
