package practice;

class Sentence2 extends Sentence3{
	 void centre() {
		System.out.print(" " +"have a");
		
	}
}

class Sentence1 extends Sentence2{
	void first() {
		System.out.print("you will");
		
	}
}

class Sentence3{
	void third() {
		System.out.print(" " +"great future, Love from Jeeva");
	}
}


public class Sentence {
	
public static void main(String[]args) {
	Sentence1 obj=new Sentence1();
	obj.first();
	obj.centre();
	obj.third();
}


}
