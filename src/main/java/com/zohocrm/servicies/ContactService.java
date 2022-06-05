package com.zohocrm.servicies;

import java.util.List;


import com.zohocrm.entity.Contact;
public interface ContactService {

	

	public List<Contact> findAllContacts();

	public Contact getContact(long id);

	void saveContact(Contact contact);

	public void deleteById(long id);

}
