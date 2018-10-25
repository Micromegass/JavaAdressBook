
public class Student extends Person {

	int studentnumber;
	Student(String name, int studentnumber) {
		
		super(name);
		this.studentnumber = studentnumber; 
		
	}
	
	
	
	public void print() {
		
		super.print();
		System.out.println("Studentnumber of" + name + "is: ");
		
		
	}
	
	
}
