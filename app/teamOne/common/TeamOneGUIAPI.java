package teamOne.common;

import java.util.List;

import models.userManagement.User;
import userManagementService.UserManagement;
import userManagementService.UserManagementImp;

public class TeamOneGUIAPI {
	
	private UserManagement usrmgmt = null;
	
	public TeamOneGUIAPI() {
		usrmgmt = new UserManagementImp();
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
