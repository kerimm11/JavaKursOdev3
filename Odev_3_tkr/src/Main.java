
public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
	    Student student = new Student(1, "kerim", "�etinkaya", "kerimm11", "12345", "9999999999");
	    studentManager.add(student);
	    studentManager.delete(student);
	    
	    �nstructorManager instructorManager = new �nstructorManager();
	    �nstructor instructor = new �nstructor(2, "engin", "demirog", "enginhoca", "45678", "engin@hotmail.com");
	    instructorManager.add(instructor);
	    instructorManager.delete(instructor);
	    
	    User [] users = {student,instructor};
	    
	    UserManager userManager = new UserManager();
	    userManager.add();
	    userManager.delete();
	    userManager.update();
	    
	    
		
		
		

	}

}
