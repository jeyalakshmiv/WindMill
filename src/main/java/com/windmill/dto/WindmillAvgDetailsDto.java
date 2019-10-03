package com.windmill.dto;

import java.util.Date;

/**
 * @author JEYALAKSHMIV
 *
 */
public class WindmillAvgDetailsDto {

	private String uniqueId;
	private long sum;
	private double avg;
	private int min;
	private int max;

	private Date date;

	public WindmillAvgDetailsDto() {

	}

	public WindmillAvgDetailsDto(String uniqueId, long sum, double avg, int min, int max, Date date) {
		this.uniqueId = uniqueId;
		this.sum = sum;
		this.avg = avg;
		this.min = min;
		this.max = max;
		this.date = date;

	}

	/**
	 * @return the uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * @param uniqueId the uniqueId to set
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * @return the sum
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @return the avg
	 */
	public double getAvg() {
		return avg;
	}

	/**
	 * @param avg the avg to set
	 */
	public void setAvg(double avg) {
		this.avg = avg;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(long sum) {
		this.sum = sum;
	}

}
