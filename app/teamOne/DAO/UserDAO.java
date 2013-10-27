package teamOne.DAO;

import java.util.List;

import models.userManagement.User;

public interface UserDAO {

	public void createUser(User user);
	
	public void deleteUser(long id);
	
	public void editUser(User user,long id);
	
	public List<User> listAllUser();
	
	public User getUserInfoByLoginName(String name);
	
	public User getUserInfoById(long id);
	
	public void deleteUserById(long id);
	
}
