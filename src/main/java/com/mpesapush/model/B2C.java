/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpesapush.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author techsavanna
 */
@Entity
@Table(name="b2c_requests")
public class B2C {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
        @Column(nullable = true)
           private String  InitiatorName;
           @Column(nullable = true)
             private String SecurityCredential;
             @Column(nullable = true)
            private String CommandID;
            @Column(nullable = true)
            private String  Remarks;
            @Column(nullable = true)
            private Long  amount;
            @Column(nullable = true)
            private Long  phoneNumber;
            @Column(nullable = true)
            private Long  partyA;
            @Column(nullable = true)
            private String  partyB; 
            @Column(nullable = true)
            private String  ResultURL;
            @Column(nullable = true)
            private String  queueTimeOutURL;
            @Column(nullable = true)
            private String  Occassion;
            @Column(nullable = true)
               private String  OriginatorConversationId; 
               @Column(nullable = true)
              private String ConversationId;
              @Column(nullable = true)
              private String ResponseDescription;
              
              @Column(nullable = true)
              private String  ResultType; 
              @Column(nullable = true)
              private String responsemsg;
              @Column(nullable = true)
             private String  resultCode;
              @Column(nullable = true)
             private String resultDesc;
              
              @Column(nullable = true)
              private String B2CWorkingAccountAvailableFunds;            
              
              @Column(nullable = true)
              private String B2CUtilityAccountAvailableFunds; 
              
              @Column(nullable = true)
              private String TransactionCompletedDateTime; 
              
              
              @Column(nullable = true)
              private String ReceiverPartyPublicName;            
              
              @Column(nullable = true)
              private String B2CChargesPaidAccountAvailableFunds; 
              
              @Column(nullable = true)
              private String B2CRecipientIsRegisteredCustomer; 
              
              @Column(nullable = true)
              private String responseDesc;            
              
              @Column(nullable = true)
              private String TransactionReceipt; 
              
              @Column(nullable = true)
              private String confirmDate;
             
              

    public B2C( ) {
        
    }



	public B2C(String initiatorName, String securityCredential, String commandID, String remarks, Long amount,
			Long partyA, String partyB, String resultURL, String queueTimeOutURL, String occassion,
			String originatorConversationId, String conversationId, String responseDescription, String resultType,
			String responsemsg, String resultCode, String resultDesc, String b2cWorkingAccountAvailableFunds,
			String b2cUtilityAccountAvailableFunds, String transactionCompletedDateTime, String receiverPartyPublicName,
			String b2cChargesPaidAccountAvailableFunds, String b2cRecipientIsRegisteredCustomer, String responseDesc,
			String transactionReceipt, String confirmDate) {
		super();
		InitiatorName = initiatorName;
		SecurityCredential = securityCredential;
		CommandID = commandID;
		Remarks = remarks;
		this.amount = amount;
		
		this.partyA = partyA;
		this.partyB = partyB;
		ResultURL = resultURL;
		this.queueTimeOutURL = queueTimeOutURL;
		Occassion = occassion;
		OriginatorConversationId = originatorConversationId;
		ConversationId = conversationId;
		ResponseDescription = responseDescription;
		ResultType = resultType;
		this.responsemsg = responsemsg;
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
		B2CWorkingAccountAvailableFunds = b2cWorkingAccountAvailableFunds;
		B2CUtilityAccountAvailableFunds = b2cUtilityAccountAvailableFunds;
		TransactionCompletedDateTime = transactionCompletedDateTime;
		ReceiverPartyPublicName = receiverPartyPublicName;
		B2CChargesPaidAccountAvailableFunds = b2cChargesPaidAccountAvailableFunds;
		B2CRecipientIsRegisteredCustomer = b2cRecipientIsRegisteredCustomer;
		this.responseDesc = responseDesc;
		TransactionReceipt = transactionReceipt;
		this.confirmDate = confirmDate;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getInitiatorName() {
		return InitiatorName;
	}



	public void setInitiatorName(String initiatorName) {
		InitiatorName = initiatorName;
	}



	public String getSecurityCredential() {
		return SecurityCredential;
	}



	public void setSecurityCredential(String securityCredential) {
		SecurityCredential = securityCredential;
	}



	public String getCommandID() {
		return CommandID;
	}



	public void setCommandID(String commandID) {
		CommandID = commandID;
	}



	public String getRemarks() {
		return Remarks;
	}



	public void setRemarks(String remarks) {
		Remarks = remarks;
	}



	public Long getAmount() {
		return amount;
	}



	public void setAmount(Long amount) {
		this.amount = amount;
	}



	public Long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Long getPartyA() {
		return partyA;
	}



	public void setPartyA(Long partyA) {
		this.partyA = partyA;
	}



	public String getPartyB() {
		return partyB;
	}



	public void setPartyB(String partyB) {
		this.partyB = partyB;
	}



	public String getResultURL() {
		return ResultURL;
	}



	public void setResultURL(String resultURL) {
		ResultURL = resultURL;
	}



	public String getQueueTimeOutURL() {
		return queueTimeOutURL;
	}



	public void setQueueTimeOutURL(String queueTimeOutURL) {
		this.queueTimeOutURL = queueTimeOutURL;
	}



	public String getOccassion() {
		return Occassion;
	}



	public void setOccassion(String occassion) {
		Occassion = occassion;
	}



	public String getOriginatorConversationId() {
		return OriginatorConversationId;
	}



	public void setOriginatorConversationId(String originatorConversationId) {
		OriginatorConversationId = originatorConversationId;
	}



	public String getConversationId() {
		return ConversationId;
	}



	public void setConversationId(String conversationId) {
		ConversationId = conversationId;
	}



	public String getResponseDescription() {
		return ResponseDescription;
	}



	public void setResponseDescription(String responseDescription) {
		ResponseDescription = responseDescription;
	}



	public String getResultType() {
		return ResultType;
	}



	public void setResultType(String resultType) {
		ResultType = resultType;
	}



	public String getResponsemsg() {
		return responsemsg;
	}



	public void setResponsemsg(String responsemsg) {
		this.responsemsg = responsemsg;
	}



	public String getResultCode() {
		return resultCode;
	}



	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}



	public String getResultDesc() {
		return resultDesc;
	}



	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}



	public String getB2CWorkingAccountAvailableFunds() {
		return B2CWorkingAccountAvailableFunds;
	}



	public void setB2CWorkingAccountAvailableFunds(String b2cWorkingAccountAvailableFunds) {
		B2CWorkingAccountAvailableFunds = b2cWorkingAccountAvailableFunds;
	}



	public String getB2CUtilityAccountAvailableFunds() {
		return B2CUtilityAccountAvailableFunds;
	}



	public void setB2CUtilityAccountAvailableFunds(String b2cUtilityAccountAvailableFunds) {
		B2CUtilityAccountAvailableFunds = b2cUtilityAccountAvailableFunds;
	}



	public String getTransactionCompletedDateTime() {
		return TransactionCompletedDateTime;
	}



	public void setTransactionCompletedDateTime(String transactionCompletedDateTime) {
		TransactionCompletedDateTime = transactionCompletedDateTime;
	}



	public String getReceiverPartyPublicName() {
		return ReceiverPartyPublicName;
	}



	public void setReceiverPartyPublicName(String receiverPartyPublicName) {
		ReceiverPartyPublicName = receiverPartyPublicName;
	}



	public String getB2CChargesPaidAccountAvailableFunds() {
		return B2CChargesPaidAccountAvailableFunds;
	}



	public void setB2CChargesPaidAccountAvailableFunds(String b2cChargesPaidAccountAvailableFunds) {
		B2CChargesPaidAccountAvailableFunds = b2cChargesPaidAccountAvailableFunds;
	}



	public String getB2CRecipientIsRegisteredCustomer() {
		return B2CRecipientIsRegisteredCustomer;
	}



	public void setB2CRecipientIsRegisteredCustomer(String b2cRecipientIsRegisteredCustomer) {
		B2CRecipientIsRegisteredCustomer = b2cRecipientIsRegisteredCustomer;
	}



	public String getResponseDesc() {
		return responseDesc;
	}



	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}



	public String getTransactionReceipt() {
		return TransactionReceipt;
	}



	public void setTransactionReceipt(String transactionReceipt) {
		TransactionReceipt = transactionReceipt;
	}



	public String getConfirmDate() {
		return confirmDate;
	}



	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
	}
	
	
    


}
