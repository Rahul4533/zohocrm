package com.zohocrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.servicies.ContactService;
import com.zohocrm.servicies.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/view")
	public String viewCreatepage() {
		
		return "Create_Lead";
		
	}

	@RequestMapping("/savelead")
	public String saveoneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	@RequestMapping("/listallLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads",leads);
		return "lead_result";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.getLead(id);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,ModelMap model){
		Lead lead = leadService.getLead(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactservice.saveContact(contact);

		leadService.deleteLead(id);
		List<Contact> contacts = contactservice.findAllContacts();
		model.addAttribute("contacts",contacts);
		return "contact_result";
		
	}
	@RequestMapping("/deleteLeadById")
	public String DeleteLead(@RequestParam("id")long id,ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads",leads);
		return "lead_result";
		
		
	}

}
