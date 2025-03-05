package model.users;

import java.util.ArrayList;

import model.Post;
import model.PostType;

public class PrivateUser extends RegisteredUser {
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
    //id, username and password will be inherited from base classes
	private String name;
	private String surname;
	private ArrayList<Post> privatePosts = new ArrayList<Post>();
	private ArrayList<Post> publicPosts = new ArrayList<Post>();
	private ArrayList<RegisteredUser> followers = new ArrayList<RegisteredUser>();
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public ArrayList<Post> getPrivatePosts() {
		return privatePosts;
	}

	public ArrayList<Post> getPublicPosts() {
		return publicPosts;
	}

	public ArrayList<RegisteredUser> getFollowers() {
		return followers;
	}

	public void setName(String inputName) {
		if(inputName!=null && inputName.matches("[A-Z]{1}[a-z]{3,15}")) {
			name = inputName;
		}
		else
		{
			name = "No name";
		}
	}
	
	public void setSurname(String inputSurname) {
		if(inputSurname !=null && inputSurname.matches("[A-Z]{1}[a-z]{3,30}")) {
			surname = inputSurname;
		}
		else
		{
			surname = "No surname";
		}
	}

	//no setters for arraylists because they are initialized at the start and after that we will add object one by one 
	
	
	public PrivateUser() {
		super();//it will call base class no argument constructor
		setName("Private");
		setSurname("User");
	}
	
	public PrivateUser(String inputUsername, String inputPassword, String inputName, 
			String inputSurname) {
		super(inputUsername, inputPassword);
		setName(inputName);
		setSurname(inputSurname);
	}
	
	public String toString() {
		return super.toString() + " " + name + " " + surname;
	}
	

	@Override
	public void createPost(PostType postType, String... params) {
		// TODO Auto-generated method stub
		
	}


}