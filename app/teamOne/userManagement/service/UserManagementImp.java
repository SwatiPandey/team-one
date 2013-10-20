package teamOne.userManagement.service;

import java.util.List;

import teamOne.DAO.DAOFactory;
import teamOne.DAO.UserDAO;
import models.userManagement.User;

public class UserManagementImp implements UserManagement{
	UserDAO dao = null;

	public UserManagementImp() {
		dao = DAOFactory.getUserDAO();
	}
	@Override
	public void createUser(User user) {
		if(!ValidateInput.CompareTwoFields(user.getPassword(),
				user.getConfirmPassword())){
			return;
		}
		dao.createUser(user);
	}

	@Override
	public void editUser(User user,long id) {
		dao.editUser(user, id);
	}

	@Override
	public void deleteUser(long id) {
		dao.deleteUser(id);
	}

	@Override
	public List<User> listAllUsers() {
		return dao.listAllUser();
	}

	@Override
	public User getUserInfoByLoginName(String name) {
		return dao.getUserInfoByLoginName(name);
	}
	
	@Override
	public User getUserInfoById(long id) {
		return dao.getUserInfoById(id);
	}

}
