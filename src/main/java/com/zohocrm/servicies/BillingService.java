package com.zohocrm.servicies;

import java.util.List;

import com.zohocrm.entity.Billing;

public interface BillingService {

	public void generateOneBill(Billing bill);

	public List<Billing> findallbills();

}
