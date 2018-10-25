
public class ArrayAdressBook {
	
	Person[] persons; 
	int value;
	int nextFree = 0;
	int freeArray = 0;

	ArrayAdressBook(int value) {
		
		if (value < 1) {
			this.persons = new Person[1];
		
		} else {
			
			this.persons = new Person[value];
		}
	
	}
	
	

	public void addElem(Person person) {
	
		if (nextFree >= persons.length) {
			doubleArray();
		}
			persons[nextFree] = person;			
			nextFree++;
		}
			
	
	
		public void doubleArray() {
			
			Person[] persons2 = new Person[persons.length * 2];
			
			for (int i = 0; i < persons.length; i++) {
				persons2[i] = persons[i];	
			}
			
			persons = persons2;
			
		}
		
		
		public void print() {
			
			int count = 0;
			
			for(int i = 0; i < persons.length; i++) {
			
				if (persons[i] != null) {
					
					count++; 
					
				}
				
			}
			
			System.out.println("At this time adress book contains " + count + " person");
			System.out.println("At this time adress capacity is " + persons.length);
			
			
			
			for (int i = 0; i < nextFree; i++) {
				
				persons[i].print();
			}

			
		}
		
		
		
		
	}
	

	
	
	
	
	