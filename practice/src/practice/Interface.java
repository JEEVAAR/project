package practice;

interface Rectangle{ //creating interface class 
	void rectangle();

}

interface Rhombus{  //creating interface class 
	void rhombus();
}

class Polygon implements Rectangle,Rhombus{  //Multiple inheritance applied by using implement keyword
	
	public void rectangle() {                //defining values for methods which are in interface class
		System.out.println("Area of rectangle= (A=wl)");
	}
	
	public void rhombus() {
		System.out.println("Area of rhombus= (A = ½ × d1 × d2)");
	}
}
public class Interface {  //creating main class
public static void main(String[]args) {  //Main method creation
	Polygon obj=new Polygon();   // object creation
	obj.rectangle();
	obj.rhombus();
}
}
