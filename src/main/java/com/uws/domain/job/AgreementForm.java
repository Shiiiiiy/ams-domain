package com.uws.domain.job;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AgreementForm implements Serializable{
	
	private static final long serialVersionUID = 6393887425610899324L;
	
	private List<AgreementModel> agreements = new ArrayList<AgreementModel>();

	public List<AgreementModel> getAgreements() {
		return agreements;
	}

	public void setAgreements(List<AgreementModel> agreements) {
		this.agreements = agreements;
	}
	
}
