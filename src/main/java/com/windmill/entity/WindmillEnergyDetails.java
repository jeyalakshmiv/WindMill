package com.windmill.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

/**
 * @author JEYALAKSHMIV
 *
 */

@Entity
@Table(name = "WINDMILL_ENERGY_DETAILS")
public class WindmillEnergyDetails implements Serializable {

	private static final long serialVersionUID = 2605533701983160625L;

	@Id
	@Column(name = "UNIQUE_ID")
	private String uniqueId;

	@Column(name = "ENERGY_PRODUCED")
	private int energyProduced;

	@CreationTimestamp
	@Column(name = "ENERGY_DATE")
	private Date energyDate;
	@CreationTimestamp
	@Temporal(TemporalType.TIME)
	@Column(name = "ENERGY_TIME")
	private java.util.Date energyTime;

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
	 * @return the energyProduced
	 */
	public int getEnergyProduced() {
		return energyProduced;
	}

	/**
	 * @param energyProduced the energyProduced to set
	 */
	public void setEnergyProduced(int energyProduced) {
		this.energyProduced = energyProduced;
	}

	/**
	 * @return the energyTime
	 */
	public java.util.Date getEnergyTime() {
		return energyTime;
	}

	/**
	 * @param energyTime the energyTime to set
	 */
	public void setEnergyTime(java.util.Date energyTime) {
		this.energyTime = energyTime;
	}

	/**
	 * @return the energyDate
	 */
	public Date getEnergyDate() {
		return energyDate;
	}

	/**
	 * @param energyDate the energyDate to set
	 */
	public void setEnergyDate(Date energyDate) {
		this.energyDate = energyDate;
	}

}
