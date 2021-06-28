package com.example.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class InquiryForm {
	
	@NotBlank
	@Size(max = 50)
	private String name;
	
	@NotBlank
	@Email
	@Size(max = 254)
	private String email;
	
	@NotBlank
	@Size(max = 500)
	private String inquiry;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInquiry() {
		return inquiry;
	}

	public void setInquiry(String inquiry) {
		this.inquiry = inquiry;
	}

	@Override
	public String toString() {
		return "InquiryForm [name=" + name + ", email=" + email + ", inquiry=" + inquiry + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getInquiry()=" + getInquiry() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
