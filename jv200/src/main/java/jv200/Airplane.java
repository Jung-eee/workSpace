package jv200;

public class Airplane implements Flyer, Vehicle{
	
	
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기 : 날기");
	}

	public void land() {
		// TODO Auto-generated method stub
		System.out.println("비행기 : 이륙하기");
	}

	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("비행기 : 착륙하기");
	}

}
