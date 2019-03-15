package com.test.package2;

/**
 * test override ÖØÐ´
 * @author Administrator
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}

}

class Vehicle{
	public void run() {
		System.out.println("run...");
	}
	public void stop() {
		System.out.println("stop...");
	}
	public Person whoIsPsg() {
		return new Person();
		
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("dadaad");
	}
	public Student whoIsPsg() {
		return new Student();
	}
}

