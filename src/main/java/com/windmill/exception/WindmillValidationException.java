/**
 * 
 */
package com.windmill.exception;

import com.windmill.constants.ErrorCodes;

/**
 * @author JEYALAKSHMIV
 *Customized Exception class
 */
public class WindmillValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7857563107215320614L;
	
	private Integer errorCode;

	public WindmillValidationException(String message, ErrorCodes errorCode) {
		super(message);
		this.errorCode = errorCode.getErrorCode();
	}

	public Integer getErrorCode() {
		return errorCode;

	}
}