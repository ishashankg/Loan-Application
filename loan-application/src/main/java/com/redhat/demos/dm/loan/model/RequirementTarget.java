package com.redhat.demos.dm.loan.model;

public class RequirementTarget
{
	private Long partyId;
	private RequirementMetaData metaData;
	
	public Long getPartyId()
	{
		return partyId;
	}

	public void setPartyId(Long partyId)
	{
		this.partyId = partyId;
	}

	public RequirementMetaData getMetaData()
	{
		return metaData;
	}

	public void setMetaData(RequirementMetaData metaData)
	{
		this.metaData = metaData;
	}

	public static RequirementTarget forPartyId(Long partyId)
	{
		RequirementTarget requirementTarget = new RequirementTarget();
		requirementTarget.partyId = partyId;
		return requirementTarget;
	}

	public static RequirementTarget forPartyIdAndMetaDatas(Long partyId, String policyNo)
	{
		RequirementTarget requirementTarget = new RequirementTarget();
		requirementTarget.partyId = partyId;
		requirementTarget.metaData = RequirementMetaData.newInstance(policyNo);
		return requirementTarget;
	}
}
