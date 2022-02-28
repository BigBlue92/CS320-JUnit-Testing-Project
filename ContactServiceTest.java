/* Author: Ryan Mackenzie
 * Date: 01/23/2022
 * Class: CS320-T3687
 * Version: 1.0
 * 
 * This is a test case to ensure the contact service works properly.
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	   // Adding correctly formatted contacts to contact array.
	   @Test
	   public void TestAddContact() {
	       ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));
	   }

	   // Attempting to add duplicate contact which should fail 
	   @Test
	   public void TestAddDuplicate() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));
	       
	       assertEquals(false, contactService.AddContact(contact1));
	   }

	   // Deleting contacts based off of the ID
	   @Test
	   public void TestContactDelete() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(true, contactService.DeleteContact("1111111111"));
	       assertEquals(true, contactService.DeleteContact("3333333333"));
	   }

	   // Attempt to delete a non existent contact
	   @Test
	   public void TestContactDeleteDoesNotExist() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(false, contactService.DeleteContact("4444444444"));
	       assertEquals(true, contactService.DeleteContact("3333333333"));
	   }

	   // Updating contacts based off of ID
	   @Test
	   public void TestContactUpdate() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(true, contactService.UpdateContact("1111111111", "updatename", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA"));
	       assertEquals(true, contactService.UpdateContact("3333333333", "firstname", "updatename", "3605551234", "1234 S Main Ave, Seattle, WA"));
	   }

	   // Attempting to update contact that does not exist
	   @Test
	   public void TestContactUpdateDoesNotExist() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(false, contactService.UpdateContact("4444444444", "updatename", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA"));
	       assertEquals(true, contactService.UpdateContact("3333333333", "firstname", "updatename", "3605551234", "1234 S Main Ave, Seattle, WA"));
	   }

}
