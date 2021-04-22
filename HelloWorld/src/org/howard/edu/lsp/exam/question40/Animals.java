package org.howard.edu.lsp.exam.question40;

/**
* This abstract class provides default implementation of abstract methods speak and move.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-22
*/
abstract class Animals {
	/**
	 * This function defines the default speak behavior of abstract class Animals.
	 */
	public void speak() {
		System.out.print("This animal speaks");
	}
	
	/**
	 * This function defines the default move behavior of abstract class Animals.
	 */
	public void move() {
		System.out.print("This animal moves forward");
	}
}

/**
 * This class is extended from abstract class Animals and defines behavior of Goose.
 */
class Goose extends Animals{
	/**
	 * This method speak defines the behavior of Goose when called speak.
	 */
	public void speak() {
		System.out.print("This Goose speaks");
	}
	
	/**
	 * This method move defines the behavior of Goose when called move.
	 */
	public void move() {
		System.out.print("This Goose moves forward");
	}
	
	/**
	 * This method fly defines the behavior of Goose when called fly.
	 */
	public void fly() {
		System.out.print("This Goose flies");
	}
}

/**
 * This class is extended from abstract class Animals and defines behavior of Tiger.
 */
class Tiger extends Animals {
	/**
	 * This method speak defines the behavior of Tiger when called speak.
	 */
	public void speak() {
		System.out.print("This Tiger speaks");
	}
	
	/**
	 * This method move defines the behavior of Tiger when called move.
	 */
	public void move() {
		System.out.print("This Tiger moves forward");
	}
}

/**
 * This class is defines the behavior of an Airplane.
 */
class Airplane {
	public void fly() {
		System.out.print("This Airplane flies");
	}
}
