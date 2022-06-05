package com.zohocrm.servicies;

import java.util.List;

import com.zohocrm.entity.Lead;
public interface LeadService {

	
	public void saveLead(Lead lead);

	public List<Lead> findAllLeads();

	public Lead getLead(long id);

	public void deleteLead(long id);
}
