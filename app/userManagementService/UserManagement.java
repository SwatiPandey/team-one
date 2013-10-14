package userManagementService;

import java.util.List;

import models.userManagementDAO.Users;

public interface UserManagement {

	public void createUser();
	
	public void editUser();
	
	public void deleteUser();
	
	public List<Users> listAllUsers();
	
	public Users getUserInfoByName(String name);
	
	public Users getUserInfoById(long id);
}
