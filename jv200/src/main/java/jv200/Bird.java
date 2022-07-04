package jv200;

public class Bird extends Animal implements Flyer{

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("새 : 날기");
		
	}

	public void land() {
		// TODO Auto-generated method stub
		System.out.println("새 : 이륙하기");
	}

	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("새 : 착륙하기");
	}

	@Override
	public void makeSound() {
		System.out.println("바보정");
		
	}

}
