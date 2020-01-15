package com.redhat.demos.dm.loan.model;

import java.io.Serializable;
import java.util.Date;

public class CaseData implements Serializable
{
	private static final long serialVersionUID = -3335836589132758134L;
	private int primaryApplicantAge;
	private String gender;
	private boolean isApplicantOwner;
	private double faceAmount;
	private boolean isPaperCase;
	private String contractState;
	private String contractLocale;
	private String contactMethod;
	private String caseSource;
	private String caseStatus;
	private String uwOwner;
	private String uwOu;
	private String svcOwner;
	private String svcOu;
	private String timeZone;
	private String externalCaseNumber;
	private String policyNumber;
	private boolean isSubmitApplication = false;
	private Date proposedEffectiveDate = null;
	private String submitTaskDescription;
	private String submitUWTaskDescription;
	private Boolean justInTimeAppointment;
	private double maxInsuranceAmount;
	private boolean isLocked = false;
	private boolean hasFinalQuote = true;
	private Long agentId;
	private Long carrierId;
	private boolean hasPhysicianData = false;
	private boolean agentSignatureExists = false;
	private boolean updateCaseStatus = false;
	private boolean isOrderRequirements = false;
	private String uwOuCode = null;
	private boolean generateApplicationPacket = false;
	private boolean isApplicantEmailSent = false;
	private boolean isLockCase = false;
	private boolean sendToService = false;
	private Date createdDate = null;
	private double premiumAmount;
	private String subStatus;
	private String quoteClass; 
	private String currentOuClass;
	private boolean caseOutOfNb;
	private boolean contractLocaleFlag;
	private String uwStatusReasonCode = null;
	private Long currentRiskCalcId;
	private boolean generateApplicationPacketImmediate = true;
	private boolean inFlow = false;
	private Boolean guaranteedIssue;
	private Boolean attusValidated;
	private boolean caseForAutoApproval = false;
	private boolean preQualiicationFlow = false;
	
	

	public int getPrimaryApplicantAge()
	{
		return primaryApplicantAge;
	}

	public void setPrimaryApplicantAge(int primaryApplicantAge)
	{
		this.primaryApplicantAge = primaryApplicantAge;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public boolean isApplicantOwner()
	{
		return isApplicantOwner;
	}

	public void setApplicantOwner(boolean isApplicantOwner)
	{
		this.isApplicantOwner = isApplicantOwner;
	}

	public double getFaceAmount()
	{
		return faceAmount;
	}

	public void setFaceAmount(double faceAmount)
	{
		this.faceAmount = faceAmount;
	}

	public boolean isPaperCase()
	{
		return isPaperCase;
	}

	public void setPaperCase(boolean isPaperCase)
	{
		this.isPaperCase = isPaperCase;
	}



	public String getContractState()
	{
		return contractState;
	}



	public void setContractState(String contractState)
	{
		this.contractState = contractState;
	}

	public String getContractLocale()
	{
		return contractLocale;
	}

	public void setContractLocale(String contractLocale)
	{
		this.contractLocale = contractLocale;
	}



	public String getContactMethod()
	{
		return contactMethod;
	}



	public void setContactMethod(String contactMethod)
	{
		this.contactMethod = contactMethod;
	}



	public String getCaseSource()
	{
		return caseSource;
	}



	public void setCaseSource(String caseSource)
	{
		this.caseSource = caseSource;
	}



	public String getCaseStatus()
	{
		return caseStatus;
	}



	public void setCaseStatus(String caseStatus)
	{
		this.caseStatus = caseStatus;
	}



	public String getUwOwner()
	{
		return uwOwner;
	}



	public void setUwOwner(String uwOwner)
	{
		this.uwOwner = uwOwner;
	}



	public String getUwOu()
	{
		return uwOu;
	}



	public void setUwOu(String uwOu)
	{
		this.uwOu = uwOu;
	}



	public String getSvcOwner()
	{
		return svcOwner;
	}



	public void setSvcOwner(String svcOwner)
	{
		this.svcOwner = svcOwner;
	}



	public String getSvcOu()
	{
		return svcOu;
	}



	public void setSvcOu(String svcOu)
	{
		this.svcOu = svcOu;
	}

	public String getTimeZone()
	{
		return timeZone;
	}

	public void setTimeZone(String timeZone)
	{
		this.timeZone = timeZone;
	}

	public String getExternalCaseNumber()
	{
		return externalCaseNumber;
	}

	public void setExternalCaseNumber(String externalCaseNumber)
	{
		this.externalCaseNumber = externalCaseNumber;
	}



	public String getPolicyNumber()
	{
		return policyNumber;
	}



	public void setPolicyNumber(String policyNumber)
	{
		this.policyNumber = policyNumber;
	}



	public boolean isSubmitApplication()
	{
		return isSubmitApplication;
	}



	public void setSubmitApplication(boolean isSubmitApplication)
	{
		this.isSubmitApplication = isSubmitApplication;
	}



	public String getSubmitTaskDescription()
	{
		return submitTaskDescription;
	}



	public void setSubmitTaskDescription(String submitTaskDescription)
	{
		this.submitTaskDescription = submitTaskDescription;
	}



	public String getSubmitUWTaskDescription()
	{
		return submitUWTaskDescription;
	}



	public void setSubmitUWTaskDescription(String submitUWTaskDescription)
	{
		this.submitUWTaskDescription = submitUWTaskDescription;
	}



	public Boolean getJustInTimeAppointment()
	{
		return justInTimeAppointment;
	}



	public void setJustInTimeAppointment(Boolean justInTimeAppointment)
	{
		this.justInTimeAppointment = justInTimeAppointment;
	}



	public double getMaxInsuranceAmount()
	{
		return maxInsuranceAmount;
	}



	public void setMaxInsuranceAmount(double maxInsuranceAmount)
	{
		this.maxInsuranceAmount = maxInsuranceAmount;
	}



	public boolean isLocked()
	{
		return isLocked;
	}



	public void setLocked(boolean isLocked)
	{
		this.isLocked = isLocked;
	}



	public boolean isHasFinalQuote()
	{
		return hasFinalQuote;
	}



	public void setHasFinalQuote(boolean hasFinalQuote)
	{
		this.hasFinalQuote = hasFinalQuote;
	}



	public Long getAgentId()
	{
		return agentId;
	}



	public void setAgentId(Long agentId)
	{
		this.agentId = agentId;
	}



	public Long getCarrierId()
	{
		return carrierId;
	}



	public void setCarrierId(Long carrierId)
	{
		this.carrierId = carrierId;
	}



	public boolean isHasPhysicianData()
	{
		return hasPhysicianData;
	}



	public void setHasPhysicianData(boolean hasPhysicianData)
	{
		this.hasPhysicianData = hasPhysicianData;
	}



	public boolean isAgentSignatureExists()
	{
		return agentSignatureExists;
	}



	public void setAgentSignatureExists(boolean agentSignatureExists)
	{
		this.agentSignatureExists = agentSignatureExists;
	}



	public boolean isUpdateCaseStatus()
	{
		return updateCaseStatus;
	}



	public void setUpdateCaseStatus(boolean updateCaseStatus)
	{
		this.updateCaseStatus = updateCaseStatus;
	}



	public boolean isOrderRequirements()
	{
		return isOrderRequirements;
	}



	public void setOrderRequirements(boolean isOrderRequirements)
	{
		this.isOrderRequirements = isOrderRequirements;
	}



	public String getUwOuCode()
	{
		return uwOuCode;
	}



	public void setUwOuCode(String uwOuCode)
	{
		this.uwOuCode = uwOuCode;
	}



	public boolean isGenerateApplicationPacket()
	{
		return generateApplicationPacket;
	}



	public void setGenerateApplicationPacket(boolean generateApplicationPacket)
	{
		this.generateApplicationPacket = generateApplicationPacket;
	}



	public boolean isApplicantEmailSent()
	{
		return isApplicantEmailSent;
	}



	public void setApplicantEmailSent(boolean isApplicantEmailSent)
	{
		this.isApplicantEmailSent = isApplicantEmailSent;
	}



	public boolean isLockCase()
	{
		return isLockCase;
	}



	public void setLockCase(boolean isLockCase)
	{
		this.isLockCase = isLockCase;
	}



	public boolean isSendToService()
	{
		return sendToService;
	}



	public void setSendToService(boolean sendToService)
	{
		this.sendToService = sendToService;
	}



	public Date getCreatedDate()
	{
		return createdDate;
	}



	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}



	public double getPremiumAmount()
	{
		return premiumAmount;
	}



	public void setPremiumAmount(double premiumAmount)
	{
		this.premiumAmount = premiumAmount;
	}



	public String getSubStatus()
	{
		return subStatus;
	}



	public void setSubStatus(String subStatus)
	{
		this.subStatus = subStatus;
	}



	public String getQuoteClass()
	{
		return quoteClass;
	}

	public void setQuoteClass(String quoteClass)
	{
		this.quoteClass = quoteClass;
	}

	public String getCurrentOuClass()
	{
		return currentOuClass;
	}

	public void setCurrentOuClass(String currentOuClass)
	{
		this.currentOuClass = currentOuClass;
	}

	public boolean isCaseOutOfNb()
	{
		return caseOutOfNb;
	}



	public void setCaseOutOfNb(boolean caseOutOfNb)
	{
		this.caseOutOfNb = caseOutOfNb;
	}



	public boolean isContractLocaleFlag()
	{
		return contractLocaleFlag;
	}



	public void setContractLocaleFlag(boolean contractLocaleFlag)
	{
		this.contractLocaleFlag = contractLocaleFlag;
	}



	public String getUwStatusReasonCode()
	{
		return uwStatusReasonCode;
	}



	public void setUwStatusReasonCode(String uwStatusReasonCode)
	{
		this.uwStatusReasonCode = uwStatusReasonCode;
	}



	public Long getCurrentRiskCalcId()
	{
		return currentRiskCalcId;
	}



	public void setCurrentRiskCalcId(Long currentRiskCalcId)
	{
		this.currentRiskCalcId = currentRiskCalcId;
	}

	public boolean isGenerateApplicationPacketImmediate()
	{
		return generateApplicationPacketImmediate;
	}

	public void setGenerateApplicationPacketImmediate(boolean generateApplicationPacketImmediate)
	{
		this.generateApplicationPacketImmediate = generateApplicationPacketImmediate;
	}

	public boolean isInFlow()
	{
		return inFlow;
	}

	public void setInFlow(boolean inFlow)
	{
		this.inFlow = inFlow;
	}

	public Boolean getGuaranteedIssue()
	{
		return guaranteedIssue;
	}

	public void setGuaranteedIssue(Boolean guaranteedIssue)
	{
		this.guaranteedIssue = guaranteedIssue;
	}

	public Boolean getAttusValidated()
	{
		return attusValidated;
	}

	public void setAttusValidated(Boolean attusValidated)
	{
		this.attusValidated = attusValidated;
	}

	public boolean isCaseForAutoApproval()
	{
		return caseForAutoApproval;
	}

	public void setCaseForAutoApproval(boolean caseForAutoApproval)
	{
		this.caseForAutoApproval = caseForAutoApproval;
	}



	public boolean isPreQualiicationFlow()
	{
		return preQualiicationFlow;
	}

	public void setPreQualiicationFlow(boolean preQualiicationFlow)
	{
		this.preQualiicationFlow = preQualiicationFlow;
	}

	public void setProposedEffectiveDate(Date proposedEffectiveDate)
	{
		this.proposedEffectiveDate = proposedEffectiveDate;
	}

	public Date getProposedEffectiveDate()
	{
		return proposedEffectiveDate != null ? new Date(proposedEffectiveDate.getTime()) : null;
	}

	@Override
	public String toString()
	{
		return "CaseData [primaryApplicantAge=" + primaryApplicantAge + ", gender=" + gender + ", isApplicantOwner="
				+ isApplicantOwner + ", faceAmount=" + faceAmount + ", isPaperCase=" + isPaperCase + ", contractState="
				+ contractState + ", contractLocale=" + contractLocale + ", contactMethod=" + contactMethod + ", caseSource="
				+ caseSource + ", caseStatus=" + caseStatus + ", uwOwner=" + uwOwner + ", uwOu=" + uwOu + ", svcOwner="
				+ svcOwner + ", svcOu=" + svcOu + ", timeZone=" + timeZone + ", externalCaseNumber=" + externalCaseNumber
				+ ", policyNumber=" + policyNumber + ", isSubmitApplication=" + isSubmitApplication
				+ ", proposedEffectiveDate=" + proposedEffectiveDate + ", submitTaskDescription=" + submitTaskDescription
				+ ", submitUWTaskDescription=" + submitUWTaskDescription + ", justInTimeAppointment=" + justInTimeAppointment
				+ ", maxInsuranceAmount=" + maxInsuranceAmount + ", isLocked=" + isLocked + ", hasFinalQuote="
				+ hasFinalQuote + ", agentId=" + agentId + ", carrierId=" + carrierId + ", hasPhysicianData="
				+ hasPhysicianData + ", agentSignatureExists=" + agentSignatureExists + ", updateCaseStatus="
				+ updateCaseStatus + ", isOrderRequirements=" + isOrderRequirements + ", uwOuCode=" + uwOuCode
				+ ", generateApplicationPacket=" + generateApplicationPacket + ", isApplicantEmailSent="
				+ isApplicantEmailSent + ", isLockCase=" + isLockCase + ", sendToService=" + sendToService + ", createdDate="
				+ createdDate + ", premiumAmount=" + premiumAmount + ", subStatus=" + subStatus + ", quoteClass="
				+ quoteClass + ", currentOuClass=" + currentOuClass + ", caseOutOfNb=" + caseOutOfNb
				+ ", contractLocaleFlag=" + contractLocaleFlag + ", uwStatusReasonCode=" + uwStatusReasonCode
				+ ", currentRiskCalcId=" + currentRiskCalcId + ", generateApplicationPacketImmediate="
				+ generateApplicationPacketImmediate + ", inFlow=" + inFlow + ", guaranteedIssue=" + guaranteedIssue
				+ ", attusValidated=" + attusValidated + ", caseForAutoApproval=" + caseForAutoApproval
				+ ", preQualiicationFlow=" + preQualiicationFlow + ", getPrimaryApplicantAge()=" + getPrimaryApplicantAge()
				+ ", getGender()=" + getGender() + ", isApplicantOwner()=" + isApplicantOwner() + ", getFaceAmount()="
				+ getFaceAmount() + ", isPaperCase()=" + isPaperCase() + ", getContractState()=" + getContractState()
				+ ", getContractLocale()=" + getContractLocale() + ", getContactMethod()=" + getContactMethod()
				+ ", getCaseSource()=" + getCaseSource() + ", getCaseStatus()=" + getCaseStatus() + ", getUwOwner()="
				+ getUwOwner() + ", getUwOu()=" + getUwOu() + ", getSvcOwner()=" + getSvcOwner() + ", getSvcOu()="
				+ getSvcOu() + ", getTimeZone()=" + getTimeZone() + ", getExternalCaseNumber()=" + getExternalCaseNumber()
				+ ", getPolicyNumber()=" + getPolicyNumber() + ", isSubmitApplication()=" + isSubmitApplication()
				+ ", getSubmitTaskDescription()=" + getSubmitTaskDescription() + ", getSubmitUWTaskDescription()="
				+ getSubmitUWTaskDescription() + ", getJustInTimeAppointment()=" + getJustInTimeAppointment()
				+ ", getMaxInsuranceAmount()=" + getMaxInsuranceAmount() + ", isLocked()=" + isLocked()
				+ ", isHasFinalQuote()=" + isHasFinalQuote() + ", getAgentId()=" + getAgentId() + ", getCarrierId()="
				+ getCarrierId() + ", isHasPhysicianData()=" + isHasPhysicianData() + ", isAgentSignatureExists()="
				+ isAgentSignatureExists() + ", isUpdateCaseStatus()=" + isUpdateCaseStatus() + ", isOrderRequirements()="
				+ isOrderRequirements() + ", getUwOuCode()=" + getUwOuCode() + ", isGenerateApplicationPacket()="
				+ isGenerateApplicationPacket() + ", isApplicantEmailSent()=" + isApplicantEmailSent() + ", isLockCase()="
				+ isLockCase() + ", isSendToService()=" + isSendToService() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getPremiumAmount()=" + getPremiumAmount() + ", getSubStatus()=" + getSubStatus() + ", getQuoteClass()="
				+ getQuoteClass() + ", getCurrentOuClass()=" + getCurrentOuClass() + ", isCaseOutOfNb()=" + isCaseOutOfNb()
				+ ", isContractLocaleFlag()=" + isContractLocaleFlag() + ", getUwStatusReasonCode()="
				+ getUwStatusReasonCode() + ", getCurrentRiskCalcId()=" + getCurrentRiskCalcId()
				+ ", isGenerateApplicationPacketImmediate()=" + isGenerateApplicationPacketImmediate() + ", isInFlow()="
				+ isInFlow() + ", getGuaranteedIssue()=" + getGuaranteedIssue() + ", getAttusValidated()="
				+ getAttusValidated() + ", isCaseForAutoApproval()=" + isCaseForAutoApproval() + ", isPreQualiicationFlow()="
				+ isPreQualiicationFlow() + ", getProposedEffectiveDate()=" + getProposedEffectiveDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}