
package implementation;

public class Pan {
	int pancardno;
	String panno;
	float Dob;
	
public Pan() {
	// TODO Auto-generated constructor stub
}

public Pan(int pancardno, String panno, float dob) {
	super();
	this.pancardno = pancardno;
	this.panno = panno;
	Dob = dob;
}

public int getPancardno() {
	return pancardno;
}

public void setPancardno(int pancardno) {
	this.pancardno = pancardno;
}

public String getPanno() {
	return panno;
}

public void setPanno(String panno) {
	this.panno = panno;
}

public float getDob() {
	return Dob;
}

public void setDob(float dob) {
	Dob = dob;
}

@Override
public String toString() {
	return "Pan [pancardno=" + pancardno + ", panno=" + panno + ", Dob=" + Dob + "]";
}

}
