package model;

public interface IPostCreate {
	//only public abstract functions are there
	//for private posts [0] - post msg; [1] - title of page, [2] - title of the next page
	public abstract void createPost(PostType postType, String ... params);

}