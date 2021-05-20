
public class Student extends User {
	
	String tcNo;
	
	public Student(int id, String name, String surName, String userName, String passaword, String tcNo) {
		super(id, name, surName, userName, passaword);
		this.tcNo = tcNo;
	}

	

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	

}
