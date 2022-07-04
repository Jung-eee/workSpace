package jv200;

public class FlyerTest {

	public static void main(String[] args) {
		Flyer f = new Airplane();
		f.takeOff();
		f.land();
		f.fly();
		Flyer b = new Bird();
		b.takeOff();
		Bird b2 = (Bird) b;
		b2.makeSound();
		
	}

}
