package com.class31_1;

public class Registration {

	private String email, userName, password;

	public void setEmail(String email) {
		if (email.contains("@gmail")) {
			this.email = email;
		} else {
			System.err.println("Invalid entry");
		}
	}

	public void setUsername(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() > 6) {
				this.userName = userName;
			} else {
				System.err.println("Username should have more than 6 characters");
			}
		} else {
			System.err.println("Username cannot be empty");
		}

	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {

				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.err.println("Password cannot contain username");
				}
			} else {
				System.err.println("Password should have more than 6 characters");
			}
		} else {
			System.err.println("Password cannot be empty");
		}
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}
