package trainee;

public class Person {

	String name;
	String id;
	int rollno;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String id, int rollno) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", rollno=" + rollno + "]";
	}

}