package userManagementService;

import java.util.List;

import models.userManagementDAO.Users;

public interface UserManagement {

	public void createUser();
	
	public void editUser();
	
	public void deleteUser(long id);
	
	public List<Users> listAllUsers();
	
	public Users getUserInfoByLoginName(String name);
	
	public Users getUserInfoById(long id);
}
