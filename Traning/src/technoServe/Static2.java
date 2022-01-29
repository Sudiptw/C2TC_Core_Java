package technoServe;

public class Static2 {
	int roll;
	String name;
	static String collage = "Mumbai University";
	  
	 Static2(int r, String n) {
	  
	  roll = r; name = n; }
	  
	  void display() { System.out.println(roll + " " + name + " " + collage); }
	  
	  public static void main(String[] args) {
	  
	  Static2 s1 = new Static2(1, "sudipt");
	   Static2 s2 = new Static2(2, "Gopal");
	  collage = "Nmmc"; s1.display(); s2.display();
	  
	  }
}
