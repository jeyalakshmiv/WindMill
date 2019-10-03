/**
 * 
 */
package com.windmill.util;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author JEYALAKSHMIV
 *
 */
public class WindmillUtil {
	/**
	 * @param errorMessage
	 * @param errorCode
	 * @return
	 * @throws Exception
	 */
	public static String toJSONStringException(String errorMessage, Integer errorCode) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> responseJsonStr = new HashMap<String, Object>();
		responseJsonStr.put("error message", errorMessage);
		responseJsonStr.put("error code", errorCode);
		return objectMapper.writeValueAsString(responseJsonStr);
	}

	/**
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public static String toJSONString(String message) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> responseJsonStr = new HashMap<String, Object>();
		responseJsonStr.put("message", message);
		return objectMapper.writeValueAsString(responseJsonStr);
	}

	/**
	 * @return object of the class instance
	 */
	public static ObjectMapper getMapperInstance() {
		ObjectMapper objectMapper = null;
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		return objectMapper;
	}

	/**
	 * @param errorMessage
	 * @param errorCode
	 * @return
	 */
	public static Map<String, String> setResponseMsg(String errorMessage, Integer errorCode) {
		Map<String, String> mapResponse = new HashMap<String, String>();
		mapResponse.put("error message", errorMessage);
		mapResponse.put("error code", errorCode.toString());
		return mapResponse;
	}

}
