package com.zohocrm.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	
	
	
	
	
	@Override
	public void saveLead(Lead lead) {
    leadrepo.save(lead);
    
	}





	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;

		
	}





	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		
		return lead;
	}





	@Override
	public void deleteLead(long id) {
		leadrepo.deleteById(id);
	}

}
