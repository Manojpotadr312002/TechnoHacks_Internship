package Internship;

interface MT{
	void start();
}

interface KTM{
	void start();
}

class Bike implements MT,KTM{
	public void start() {
		System.out.println("MT has started ..!");
		System.out.println("KTM has started ..!");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		MT mybike = new Bike();
		mybike.start();

//		KTM mybike1 = new Bike();
//		mybike1.start();
	}

}
