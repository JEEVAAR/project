package practice;

class Behaviour {
	
	void peacock() {
		String sound="kuuuuuuuuuukuuuuuuu";
		String colour="kir kir kir";
		System.out.println(sound);
		System.out.println(colour);
		
	}
}

class child extends Behaviour{

	@Override
	void peacock() {
	
		System.out.println("kikiki");
	}
	
}


class superchild extends Behaviour{

	@Override
	void peacock() {
		// TODO Auto-generated method stub
		
		System.out.println("kich kich kich");
	}
	
}


public class Bird {

	public static void main(String[] args) {
		Behaviour obj=new Behaviour();
		obj.peacock();
		Behaviour obj2=new child();
		obj2.peacock();
		Behaviour obj3=new superchild();
		obj3.peacock();
	}

}
