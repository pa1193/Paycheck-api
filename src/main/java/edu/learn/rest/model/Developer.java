package edu.learn.rest.model;

public class Developer {
	private String email ;
	private String firstName ;
	private String lastName;
	public Developer() {
		super();
		email = "themrbirkelund@gmail.com";
		firstName = "Paul";
		lastName = "Birkelund";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Developer [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
