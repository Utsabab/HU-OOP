package org.howard.edu.lsp.assignment4.implementation;

/**
 * The IntegerSetException class extends the Exception class and implements the new method named IntegerSetException.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-03-04
 */
public class IntegerSetException extends Exception {
	/**
	 * This constructor takes the message as the parameter and throws it as a exception.
	 * 
	 * @param message	This is the string message sent as a parameter from the IntegerSet class
	 */
	public IntegerSetException(String message) {
		super(message);
	}
}