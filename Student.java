package week3.day1;
//Class: Students
//Methods: getStudentInfo()
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
public class Student {

	public void getStudentInfo(int id) 
	{
		System.out.println("Student ID is: "+ id);
	}

	public void getStudentInfo(String name)
	{
		System.out.println("Student Name is: "+ name);
	}
	
	public void getStudentsInfo(String email) 
	{
		System.out.println("Student Email is : "+ email);
	}
	
	public void getStudentInfo(long phoneNumber) 
	{
		System.out.println("Student PhoneNumber is: "+ phoneNumber);
	}
	
	public static void main(String[] args) { 
		
		Students students=new Students();
		
		students.getStudentInfo(1142);
		students.getStudentInfo("Raji");
		students.getStudentInfo(9894165936L);
		students.getStudentInfo("rajiece.92@gmail.com");
			
	}
}
