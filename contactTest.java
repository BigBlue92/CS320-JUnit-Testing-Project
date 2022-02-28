/* Author: Ryan Mackenzie
 * Date: 01/23/2022
 * Class: CS320-T3687
 * Version: 1.0
 * 
 * This is a test case to ensure the contact class works properly.
 * 
 */



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class contactTest {

	// Verifying that adding a properly fomratted contact works.
	@Test
	void testContact() {
		Contact testContact = new Contact("1234567890", "firstname", "lastname", "3605551234", "1234 main st, seattle, WA");
		assertTrue(testContact.getID().equals("1234567890"));
		assertTrue(testContact.getFirstName().equals("firstname"));
		assertTrue(testContact.getLastName().equals("lastname"));
		assertTrue(testContact.getPhone().equals("3605551234"));
		assertTrue(testContact.getAddress().equals("1234 main st, seattle, WA"));
	}

	// Verifying exception is thrown if ID is not 10 characters.
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "firstname", "lastname", "3605551234", "1234 main st, seattle, WA");
		});		
	}
	
	@Test
	void testIDTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "firstname", "lastname", "3605551234", "1234 main st, seattle, WA");
		});		
	}
	
	// Verifying exception thrown when inputs are too long. 
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "firstnametoolong", "lastname", "3605551234", "1234 main st, seattle, WA");
		});		
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "firstname", "lastnametoolong", "3605551234", "1234 main st, seattle, WA");
		});		
	}
	
	// Verifying phone number is 10 digits with next two tests.
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "firstname", "lastname", "36055512345", "1234 main st, seattle, WA");
		});		
	}
	
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "firstname", "lastname", "360555123", "1234 main st, seattle, WA");
		});		
	}
	
	// Verifying exception is thrown if address is longer that 30 characters.
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "firstname", "lastname", "3605551234", "1234 main st, seattle, WA, aslkdjalskdjlaskdjlaksdjlaskdjlaksijdlaksdjlaksjdlaksjdlkajsdlkasjd");
		});		
	}
	

}
