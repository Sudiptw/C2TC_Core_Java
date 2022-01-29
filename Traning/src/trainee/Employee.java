package trainee;

public class Employee extends Person {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String id, int rollno) {
		super(name, id, rollno);

		// TODO Auto-generated constructor student
	}

	public static void main(String[] args) {
		Employee emp = new Employee("sudipt", "sudipt.com", 54);
       System.out.println(emp);
	}

}
