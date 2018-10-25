
public class AdressBookTest {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayAdressBook a1 = new ArrayAdressBook(3);
		
		Person p1 = new Person("Axel");
		Person p2 = new Person("Michael");
		Person p3 = new Person("susi");
		Person p4 = new Person("Kalid");
		Person p5 = new Person("ralf");
		Person p6 = new Person("roman");
		Person p7 = new Person("jack");





		a1.addElem(p1);
		a1.addElem(p2);
		a1.addElem(p3);
		a1.addElem(p4);
		a1.addElem(p5);
		a1.addElem(p6);
		a1.addElem(p7);



		
		a1.print();
		
		
		
	}
	
	
	

}
