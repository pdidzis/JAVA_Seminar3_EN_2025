package model.users;

public class User {
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	protected int id;
	
	private static int counter = 0;

	public int getId() {
		return id;
	}
	
	public void setId() {
		id = counter++;
	}
	
	public User() {
		setId();
	}
	
	public String toString() {
		return id + "";
	}

}