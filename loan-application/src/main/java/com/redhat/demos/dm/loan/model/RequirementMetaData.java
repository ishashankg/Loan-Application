package com.redhat.demos.dm.loan.model;

public class RequirementMetaData
{
	private String policyNo;

	public String getPolicyNo()
	{
		return policyNo;
	}

	public static RequirementMetaData newInstance(String policyNo)
	{
		RequirementMetaData metaData = new RequirementMetaData();
		metaData.policyNo = policyNo;
		return metaData;
	}
}
