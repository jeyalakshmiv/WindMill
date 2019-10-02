package com.windmill.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
/**
 * @author JEYALAKSHMIV
 *
 */

@Entity
@Table(name = "WINDMILL_ENERGY_DETAILS")
public class WindmillEnergyDetails  implements Serializable {

private static final long serialVersionUID = 2605533701983160625L;

@Id
@Column(name = "UNIQUE_ID")
private String uniqueId;	

@Column(name = "ENERGY_PRODUCED")	
private int  energy_produced;

@CreationTimestamp
@Column(name = "ENERGY_TIME")
private LocalDateTime energy_time;


public String getUniqueId() {
	return uniqueId;
}

public void setUniqueId(String uniqueId) {
	this.uniqueId = uniqueId;
}

public int getEnergy_produced() {
	return energy_produced;
}

public void setEnergy_produced(int energy_produced) {
	this.energy_produced = energy_produced;
}

public LocalDateTime getEnergy_time() {
	return energy_time;
}

public void setEnergy_time(LocalDateTime energy_time) {
	this.energy_time = energy_time;
}



}
