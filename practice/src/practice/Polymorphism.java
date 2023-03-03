package practice;


class Living_thing{  //Creating a parent method
   void living_thing() {
	   System.out.println("Living Things");
   }
}

class Human_being extends Living_thing{ //Parent class extended by sub class

	@Override
	void living_thing() {                     //over riding parent method by, right click>sourse>override>select class>ok
		// TODO Auto-generated method stub
		
		System.out.println("humans can speak");
	}	
}

class Bacteria extends Living_thing{

	@Override
	void living_thing() {
		super.living_thing();
		System.out.println("Microscope is used to see Bacteria");
	}
	
}

class Plants extends Living_thing{

	@Override
	void living_thing() {
		// TODO Auto-generated method stub
		System.out.println("Plants reduces the global warming");
	}
	
}

class Animals extends Living_thing{

	@Override
	void living_thing() {
		// TODO Auto-generated method stub
		System.out.println("Animals having only 5 senses");
	}
	
}

public class Polymorphism {
	
	public static void main(String[]args) {
		Living_thing obj=new Living_thing();  //object creation
		obj.living_thing();                   //calling method
		Living_thing obj1=new Human_being();
		obj1.living_thing();
		Living_thing obj2=new Bacteria();
		obj2.living_thing();
		Living_thing obj3=new Plants();
		obj3.living_thing();
		Living_thing obj4=new Animals();
		obj4.living_thing();
	}
}
