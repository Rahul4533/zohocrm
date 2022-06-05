package com.zohocrm.servicies;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Contact;
import com.zohocrm.repositories.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;

	@Override
	public void saveContact(Contact contact) {
      contactrepo.save(contact);
	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContact(long id) {
			Contact contact = contactrepo.getById(id);
			
		
			return contact;
	}

	@Override
	public void deleteById(long id) {
     contactrepo.deleteById(id);		
	}

	

	
	
	
	
	
	
}
