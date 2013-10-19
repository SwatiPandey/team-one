package userManagementService;

import java.util.List;

import models.userManagement.User;

public interface UserManagement {

	public void createUser();
	
	public void editUser();
	
	public void deleteUser(long id);
	
	public List<User> listAllUsers();
	
	public User getUserInfoByLoginName(String name);
	
	public User getUserInfoById(long id);
}
