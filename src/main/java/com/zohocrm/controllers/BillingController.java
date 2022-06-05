package com.zohocrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Billing;
import com.zohocrm.servicies.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingservice;
	
	
	@RequestMapping("/generate")
	public String generatOneBill(@ModelAttribute("bill")Billing bill,ModelMap model) {
		billingservice.generateOneBill(bill);
		model.addAttribute("bill",bill);
		return "billing_info";
		
	}
	
	@RequestMapping("/Billing")
	public String GetAllBill(ModelMap model) {
		List<Billing> bills = billingservice.findallbills();
		model.addAttribute("bills",bills);
		return "billing_result";
		
	}

}
