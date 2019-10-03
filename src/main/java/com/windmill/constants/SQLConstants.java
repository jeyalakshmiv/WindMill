/**
 * 
 */
package com.windmill.constants;

/**
 * @author JEYALAKSHMIV
 * HQL Query
 */
public class SQLConstants {

	/**
	 * To check the unique is present or not
	 */
	public static final String CHECK_WINDMILL_ID_AVAILABLE = "from WindmillDetails  where uniqueId =:uniqueId";
	/**
	 * To get the values for the chart creation
	 */
	public static final String GET_WINDMILL_CHART_DETAILS = " Select new com.windmill.dto.WindmillAvgDetailsDto (w.uniqueId as Windmill_ID,sum(w.energyProduced) as Sum ,avg(w.energyProduced) as Avg ,min(w.energyProduced) as Min ,max(w.energyProduced) as Max,w.energyDate as Date)  from WindmillEnergyDetails w where w.uniqueId = :uniqueId  group by  w.energyTime order by  w.energyTime ";
	
	
}
