package teamOneApi;

import java.util.List;

import models.userManagementDAO.Users;
import userManagementService.UserManagement;
import userManagementService.UserManagementImp;

public class TeamOneGUIAPI {
	
	private UserManagement usrmgmt = null;
	
	public TeamOneGUIAPI() {
		usrmgmt = new UserManagementImp();
	}
	public List<Users> displayAllUsers(){
		return usrmgmt.listAllUsers();
	}
}
