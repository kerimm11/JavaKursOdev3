
public class Żnstructor extends User {
	
	String mail;
	
	public Żnstructor(int id, String name, String surName, String userName, String passaword, String mail) {
		super(id, name, surName, userName, passaword);
		this.mail = mail;
	}

	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	

}
