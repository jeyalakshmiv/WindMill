/**
 * 
 */
package com.windmill.constants;

/**
 * @author JEYALAKSHMIV
 *
 */
public class SQLConstants {

	public static final String CHECK_WINDMILL_ID_AVAILABLE = "from WindmillDetails  where uniqueId =:uniqueId";
	public static final String GET_WINDMILL_CHART_DETAILS = "from WindmillAvgDetails where uniqueId = :uniqueId";

}
