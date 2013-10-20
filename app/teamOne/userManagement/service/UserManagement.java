package teamOne.userManagement.service;

import java.util.List;

import models.userManagement.User;

public interface UserManagement {

	public void createUser(User user);
	
	public void editUser(User user,long id);
	
	public void deleteUser(long id);
	
	public List<User> listAllUsers();
	
	public User getUserInfoByLoginName(String name);
	
	public User getUserInfoById(long id);
}
