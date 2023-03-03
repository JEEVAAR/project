package practice;


abstract class Traveler{ //Abstract class creation
	//void run(){//write code here}
	abstract void travels_names(); //Empty body
	abstract void booking(); //Empty body
	
}

class Travels_names extends Traveler{  //creating class for defining values for abstract class
	
	void travels_names() {
		System.out.println("Best travels is RPR travels");
		System.out.println("Budget friendly travels is ARJ travels");
	
	}
	
	void booking() {
		System.out.println("You can use RPR Website/App for booking");
		System.out.println("You can use ARJ Website/App for booking");
	}
}


public class Abstract {
	
public static void main(String []args) {
	Traveler obj1=new Travels_names(); //	Object creation
	obj1.travels_names();
	obj1.booking();
}
}
