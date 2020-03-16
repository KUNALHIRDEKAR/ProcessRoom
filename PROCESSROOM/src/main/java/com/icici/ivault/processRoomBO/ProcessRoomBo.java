package com.icici.ivault.processRoomBO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Process_Room_TBL")
@Data
public class ProcessRoomBo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(
		    name="seq",
		    sequenceName="PR_sequence",
		    allocationSize=20
		)
	private long prReqNO;
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long prREqSeq;
	private int prReqBankIrd;//NA
	private int prReqIcmcID;
	private int prDenoId;
	private int prReqBundles;
	private long prReqDenoinationValue;
	private int prInwReqNo;
	private int prInwReqSeq;
	private Date prChestOutTime;
	private int prChestUserId;
	private int prReqDenominationPack;
	private Date prReqCashReciptTime;
	private String prReqCashReciptEmpid;

}