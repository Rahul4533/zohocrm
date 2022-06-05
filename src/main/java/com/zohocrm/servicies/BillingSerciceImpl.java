package com.zohocrm.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Billing;
import com.zohocrm.repositories.BillingRepository;

@Service
public class BillingSerciceImpl implements BillingService {

	@Autowired
	private BillingRepository billingrepo;

	@Override
	public void generateOneBill(Billing bill) {
		billingrepo.save(bill);
	}

	@Override
	public List<Billing> findallbills() {
		List<Billing> bills = billingrepo.findAll();
		return  bills;
		
		
	}
	
}
