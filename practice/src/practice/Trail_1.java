package practice;

import java.util.Scanner;

//method overloading

public class Trail_1 {
	 public  static void jeeva(int j) {
			
			
			int increment=j+3000;
			
			System.out.println(" ");
			System.out.println(increment);
			System.out.println(" ");
		} 
    public  static void jeeva(String k,int j) {
		
		String worker_name=k;
		int increment=j+2000;
		
		
		System.err.println(worker_name);
		System.out.println(increment);
		System.out.println(" ");
	}
	public  static void jeeva(String a,int b,String c) {
		
		String worker_name=a;
		int increment=b+1000;
		String worker_id=c;
		
		System.out.println(worker_name);
		System.out.println(increment);
		System.out.println(worker_id);	
		System.out.println(" ");
	}
	public static void main(String[] args) {
		String name;
		 int salary;
		 String id;
		 
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a name");
		   name=input.nextLine();
		   System.out.println("Enter the salary");
		   salary=input.nextInt();
		   System.out.println("Enter a ID");
		   id=input.next();
		   
		   jeeva(salary);
		   jeeva(name,salary);
		   jeeva(name,salary,id);
		   
	
	}

}
