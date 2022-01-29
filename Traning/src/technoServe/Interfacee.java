package technoServe;

interface X{
	void Adisplay();
}
interface Y{
	void Bdisplay();
}
class BIE implements X,Y{
	public void Adisplay() {
		System.out.println("i am a");
	}
	public void Bdisplay() {
		System.out.println("i am b");
	}
}
public class Interfacee {
public static void main(String[] args) {
	
	BIE m=new BIE();
	m.Adisplay();
	m.Bdisplay();
}
}


