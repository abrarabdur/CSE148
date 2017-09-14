package sample1;

public class Name {
	private String fName;
	private String mInitial;
	private String lName;

	public Name(String fName, String mInitial, String lName) {
		super();
		this.fName = fName;
		this.mInitial = mInitial;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmInitial() {
		return mInitial;
	}

	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Name [fName=" + fName + ", mInitial=" + mInitial + ", lName=" + lName + "]";
	}

}
