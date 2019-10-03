/**
 * 
 */
package com.windmill.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author JEYALAKSHMIV
 *
 */
@Entity
@Table(name = "WINDMILL_AVG_DETAILS")
public class WindmillAvgDetails implements Serializable {

	private static final long serialVersionUID = 2605533701983160625L;

	@Id
	private String uniqueId;

	@Column(name = "SUM")
	private double sum;

	@Column(name = "MIN")
	private double min;

	@Column(name = "MAX")
	private double max;

	@Column(name = "AVG")
	private double avg;

	@Column(name = "AVG_DATE")
	private double avg_date;

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getAvg_date() {
		return avg_date;
	}

	public void setAvg_date(double avg_date) {
		this.avg_date = avg_date;
	}

}
