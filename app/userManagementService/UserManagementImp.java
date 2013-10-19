package userManagementService;

import java.util.List;

import models.userManagement.User;

public class UserManagementImp implements UserManagement{
	User users =null;
	
	public UserManagementImp() {
		 users = new User();
	}
	@Override
	public void createUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(long id) {
		users.deleteUserById(id);
	}

	@Override
	public List<User> listAllUsers() {
		
		return users.listAllUsers(); 
	}

	@Override
	public User getUserInfoByLoginName(String name) {
		return users.getUserInfoByLoginName(name);
	}
	@Override
	public User getUserInfoById(long id) {
		// TODO Auto-generated method stub
		return users.getUserInfoById(id);
	}

}
