
public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
	    Student student = new Student(1, "kerim", "çetinkaya", "kerimm11", "12345", "9999999999");
	    studentManager.add(student);
	    studentManager.delete(student);
	    
	    İnstructorManager instructorManager = new İnstructorManager();
	    İnstructor instructor = new İnstructor(2, "engin", "demirog", "enginhoca", "45678", "engin@hotmail.com");
	    instructorManager.add(instructor);
	    instructorManager.delete(instructor);
	    
	    User [] users = {student,instructor};
	    
	    UserManager userManager = new UserManager();
	    userManager.add();
	    userManager.delete();
	    userManager.update();
	    
	    
		
		
		

	}

}
