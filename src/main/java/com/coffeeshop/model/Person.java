package com.coffeeshop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	private String phone;
	private boolean enable;
	private String password;
	private String rePassword;
	private Role role;

	public Person(){

	}

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Person(Long id){
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

	public void setId(long id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", address=" + address +
            ", phone='" + phone + '\'' +
            ", enable=" + enable +
            ", password='" + password + '\'' +
            ", rePassword='" + rePassword + '\'' +
            ", role=" + role +
            '}';
    }
}
