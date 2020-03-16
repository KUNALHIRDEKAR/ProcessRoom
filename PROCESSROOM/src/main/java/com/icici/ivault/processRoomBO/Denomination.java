package com.icici.ivault.processRoomBO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Denomination")
@Data
public class Denomination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int demoID;
	private int noteDenomination;
	private int denoFlag;
	private int denoSeries;

}
