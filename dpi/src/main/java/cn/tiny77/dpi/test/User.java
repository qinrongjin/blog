package cn.tiny77.dpi.test;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull
	@Size(max=14,min=2)
	private String firstName;

	@NotNull
	@Size(max=14,min=2)
	private String lastName;

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
	
	
	
}
