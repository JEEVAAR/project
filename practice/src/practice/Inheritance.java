package practice;

class Animal extends Tiger{ //Super class extended by child class
	void animal() {
		System.out.println("Animal's having only 5 senses");
		
	}
}


class Lion extends Animal{
	void lion() {
		System.out.println("Lions have strong, compact bodies and powerful forelegs, teeth and jaws.");
	}
}

class Tiger extends Fox {
	void tiger() {
		System.out.println("Tigers live for about 25 years.");
	}
}

class Fox extends Zebra{
	void fox() {
		System.out.println("Foxes have long fur, pointed ears, relatively short legs, and a narrow snout.");
	}
}

class Zebra {
	void zebra() {
		System.out.println("Grant's zebras live on the African savanna.");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Lion characteristics=new Lion(); //Creation of object
		characteristics.lion();
		characteristics.animal();
		characteristics.tiger();
		characteristics.fox();
		characteristics.zebra();
		
	}
}
