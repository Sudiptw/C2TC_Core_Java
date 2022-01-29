package implementation;

public class Theory extends Studentmes {
	public static void main(String[] args) {
		Studentmes s1=new Studentmes("sudipt",54);
		Theory t1 = new Theory(86,89,91,88,86+89+91+88);
		System.out.println(t1);
		}
	int mca;
	int dbms;
	int ccn;
	int ipmv;
	int sum = mca + dbms + ccn + ipmv;

	public Theory() {
		// TODO Auto-generated constructor stub
	}

	public Theory(int mca, int dbms, int ccn, int ipmv, int sum) {
		super();
		this.mca = mca;
		this.dbms = dbms;
		this.ccn = ccn;
		this.ipmv = ipmv;
		this.sum = sum;
	}

	public int getMca() {
		return mca;
	}

	public void setMca(int mca) {
		this.mca = mca;
	}

	public int getDbms() {
		return dbms;
	}

	public void setDbms(int dbms) {
		this.dbms = dbms;
	}

	public int getCcn() {
		return ccn;
	}

	public void setCcn(int ccn) {
		this.ccn = ccn;
	}

	public int getIpmv() {
		return ipmv;
	}

	public void setIpmv(int ipmv) {
		this.ipmv = ipmv;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Theory [mca=" + mca + ", dbms=" + dbms + ", ccn=" + ccn + ", ipmv=" + ipmv + ", sum=" + sum + ", name="
				+ name + ", id=" + id + "]";
	}

}
