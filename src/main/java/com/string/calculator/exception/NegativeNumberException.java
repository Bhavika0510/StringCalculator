package com.string.calculator.exception;

/**
 * @author Bhavika
 *  
 *  Class to handle negative number exception
 *
 */
public class NegativeNumberException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 726717178065931382L;
	private String code;

    public NegativeNumberException(String code, String message) {
        super(message);
        this.setCode(code);
    }

    public NegativeNumberException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
