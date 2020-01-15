package com.redhat.demos.dm.loan.model;

import java.util.HashSet;
import java.util.Set;

public class RequirementForm
{
	private Long productRequirementItemId;
	private String code;
	private Long applicantId;
	private boolean isRequired;
	private boolean isWaivable;
	private String type;
	private String defaultStatus;
	private boolean isCancelRequirementWhenNotRequired = true;
	private Set<RequirementTarget> obsoleteRequirementTarget = new HashSet<RequirementTarget>(0);
	private Set<RequirementTarget> requirementTargetParty = new HashSet<RequirementTarget>(0);
	
	public Long getProductRequirementItemId()
	{
		return productRequirementItemId;
	}

	public void setProductRequirementItemId(Long productRequirementItemId)
	{
		this.productRequirementItemId = productRequirementItemId;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public Long getApplicantId()
	{
		return applicantId;
	}

	public void setApplicantId(Long applicantId)
	{
		this.applicantId = applicantId;
	}

	public boolean isRequired()
	{
		return isRequired;
	}

	public void setRequired(boolean isRequired)
	{
		this.isRequired = isRequired;
	}

	public boolean isWaivable()
	{
		return isWaivable;
	}

	public void setWaivable(boolean isWaivable)
	{
		this.isWaivable = isWaivable;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getDefaultStatus()
	{
		return defaultStatus;
	}

	public void setDefaultStatus(String defaultStatus)
	{
		this.defaultStatus = defaultStatus;
	}

	public Set<RequirementTarget> getObsoleteRequirementTarget()
	{
		return obsoleteRequirementTarget;
	}

	public void setObsoleteRequirementTarget(Set<RequirementTarget> obsoleteRequirementTarget)
	{
		this.obsoleteRequirementTarget = obsoleteRequirementTarget;
	}

	public Set<RequirementTarget> getRequirementTargetParty()
	{
		return requirementTargetParty;
	}

	public void setRequirementTargetParty(Set<RequirementTarget> requirementTargetParty)
	{
		this.requirementTargetParty = requirementTargetParty;
	}

	public void setCancelRequirementWhenNotRequired(boolean isCancelRequirementWhenNotRequired)
	{
		this.isCancelRequirementWhenNotRequired = isCancelRequirementWhenNotRequired;
	}

	public RequirementForm()
	{
	}

	@Deprecated
	public Long getFormId()
	{
		return productRequirementItemId;
	}

	public boolean isCancelRequirementWhenNotRequired()
	{
		return isCancelRequirementWhenNotRequired;
	}

	public void addToObsoleteRequirementTarget(RequirementTarget requirementTarget)
	{
		obsoleteRequirementTarget.add(requirementTarget);
	}

	public void addToRequirementTargetParty(RequirementTarget requirementTarget)
	{
		requirementTargetParty.add(requirementTarget);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('<').append(this.getClass().getSimpleName()).append(" code:").append(this.code).append(", isRequired:")
				.append(this.isRequired).append(", type:").append(this.type).append(", defaultStatus:")
				.append(this.defaultStatus).append(", isWaivable:").append(this.isWaivable)
				.append(", isCancelRequirementWhenNotRequired:").append(this.isCancelRequirementWhenNotRequired).append('>');
		return sb.toString();
	}
}