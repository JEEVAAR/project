package practice;

class Trail{ //creation of class
	public static void run()
	{
	int j=22;
	int r=10;
	int m;
	}

	try {
		m=j+r;
		System.out.println("operation is executing");
		
	}
	
	catch(ArithmeticException e) {
		
		System.out.println("Error");
	}

}
public class Exception_Handling 
{
	public static void main(String[] args) {
	 Trail obj= new Trail();
	 obj.run();
	 //obj.try();
     //obj.catch();
			 
	}
}
