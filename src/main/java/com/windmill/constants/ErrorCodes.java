/**
 * 
 */
package com.windmill.constants;

/**
 * @author JEYALAKSHMIV
 * All error codes which customized for the application is declared here.
 */
public enum ErrorCodes {

	SERVICE_ERROR(1000), WINDMILL_ID_PRESENT_ERROR_CODE(10001), INCORRECT_WINDMILL_ID(10002), WINDMILL_ID_NOT_NULL(10003);

	private int errorCode;

	private ErrorCodes(int code) {
		this.errorCode = code;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
