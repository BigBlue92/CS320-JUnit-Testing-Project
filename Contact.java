/* Author: Ryan Mackenzie
 * Date: 01/23/2022
 * Class: CS320-T3687
 * Version: 1.0
 * 
 * This is a class that defines the contact object and has
 * some error checking to ensure inputs are valid.
 * 
 */


public class Contact {
    /* contact fields */
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/* Contact constructor */
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if (id == null | id.length() != 10) {
			throw new IllegalArgumentException("Invalid id");
			
		} else if (lastName == null | lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
			
		} else if (firstName == null | firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
			
		} else if (phone == null | phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
			
		} else if (address == null | address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
			
		} else {
			this.id = id;
			this.lastName = lastName;
			this.firstName = firstName;
			this.phone = phone;
			this.address = address;
		}
		
	}
	
	// Getters
	public String getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object contact) {
		// Verifying object is not null and class is contact
		if (contact == this) {
			return true;
		}
		if (contact == null) {
			return false;
		}
		if (getClass() != contact.getClass()) {
			return false;
		}
		
		// Checking for matching or null ID
		Contact other = (Contact) contact;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	

}
