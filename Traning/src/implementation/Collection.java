package implementation;

import java.util.ArrayList;

public class Collection {
public static void main(String[] args) {
	
	
	ArrayList<Aadhar> cit=new ArrayList<Aadhar>();
	
	Aadhar sudipt=new Aadhar("1234567","","sudipt");
	Aadhar kalabai=new  Aadhar("12345678","","kalabai");
	
	cit.add(kalabai);
	cit.add(sudipt);
	cit.remove(kalabai);
	
	System.out.println(cit);
	
}
}
