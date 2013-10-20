package teamOne.common;

import java.util.List;

import models.userManagement.User;
import teamOne.userManagement.service.UserManagement;
import teamOne.userManagement.service.UserManagementImp;

public class TeamOneGUIAPI {
	
	private UserManagement usrmgmt = null;
	
	public TeamOneGUIAPI() {
		if(usrmgmt == null){
			usrmgmt = new UserManagementImp();
		}
	}
	public void editUser(User user,long id){
		usrmgmt.editUser(user,id);
	}
	public void createUser(User user){
		usrmgmt.createUser(user);
	}
	public List<User> displayAllUsers(){
		return usrmgmt.listAllUsers();
	}
	
	public User getUserInfoByLoginName(String name){
		return usrmgmt.getUserInfoByLoginName(name);
	}
	
	public void deleteUserById(long id){
		usrmgmt.deleteUser(id);
	}
	
}
