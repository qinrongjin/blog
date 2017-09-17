package cn.tiny77.dpi.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

public class User {

	@NotNull
	@Pattern(regexp="^[a~zA-Z][a~zA-Z][0-9]{4,}$", message="用户名格式需为字母数字，最少6个字符")
	private String userName;
	@NotNull
	@Email
	private String email;
	private String name;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
