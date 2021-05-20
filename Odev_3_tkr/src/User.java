
public class User {
	
	int id;
	String name;
	String surName;
	String userName;
	String passaword;
	
	public User () {
		
	}
	
	public User(int id, String name, String surName, String userName, String passaword) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.userName = userName;
		this.passaword = passaword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassaword() {
		return passaword;
	}

	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
	

}
