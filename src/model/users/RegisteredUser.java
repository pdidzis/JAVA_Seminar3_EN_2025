package model.users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import model.IPostCreate;
import model.PostType;

public abstract class RegisteredUser extends User implements IPostCreate {
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setUsername(String inputUsername) {
		if(inputUsername != null && inputUsername.matches("[A-Za-z.]{6,25}"))
		{
			username = id + "_" + inputUsername;
		}
		else
		{
			username = "No username";
		}
	}
	
	//TODO regex for password is from https://www.ocpsoft.org/tutorials/regular-expressions/password-regular-expression/
	public void setPassword(String inputPassword) {
		if(inputPassword != null && inputPassword.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$"))
		{
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputPassword.getBytes());
				password = new String(md.digest());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				password = "No password";
			}
		}
		else
		{
			password = "No password";
		}
	}
	
	public RegisteredUser()
	{
		super();//will call User class no argument constructor
		setUsername("test.user");
		setPassword("1234QWerty?");
		
	}
	public RegisteredUser(String inputUsername, String inputPassword) {
		super();//will call User class no argument constructor
		setUsername(inputUsername);
		setPassword(inputPassword);
	}
	
	public String toString() {
		return super.toString() + ": " + username + " (" + password+ ")";
	}
	

}