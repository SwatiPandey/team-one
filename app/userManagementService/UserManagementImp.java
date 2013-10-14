package userManagementService;

import java.util.List;

import models.userManagementDAO.Users;

public class UserManagementImp implements UserManagement{
	Users users =null;
	
	public UserManagementImp() {
		 users = new Users();
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
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> listAllUsers() {
		
		return users.listAllUsers(); 
	}

	@Override
	public Users getUserInfoByName(String name) {
		return users.getUserInfoByName(name);
	}
	@Override
	public Users getUserInfoById(long id) {
		// TODO Auto-generated method stub
		return users.getUserInfoById(id);
	}

}
