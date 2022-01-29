package technoServe;
public class Method_overloading {
	
	void m() {
		System.out.println("I am Default method");
	}
    void m(int i) {
    	System.out.println("I am Integer");
    }
    void m(double f) {
    	System.out.println("I am double");
    }
    public static void main(String[] args) {
		
    	Method_overloading p=new Method_overloading();
    	p.m();
    	p.m(5);
    	p.m(25f);
    	p.m('s');
    	p.m(6.7);
    }
}