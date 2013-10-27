package teamOne.DAO;

import java.util.List;

import play.db.ebean.Model.Finder;
import models.userManagement.User;

public class UserDAOImp  implements UserDAO{

	public static Finder<Long,User> find = new
	 Finder<Long,User>( Long.class, User.class );

	@Override
	public void createUser(User user) {
		user.save();
	}

	@Override
	public void deleteUser(long id) {
		UserDAOImp.find.ref(id).delete();
	}

	@Override
	public void editUser(User user,long id) {
		//filledForm.get().update(id);
		user.update(id);		
	}

	@Override
	public List<User> listAllUser() {
		 return UserDAOImp.find.all();
	}

	@Override
	public User getUserInfoByLoginName(String name) {
		 List<User> users = UserDAOImp.find.all(); 
		 for(User user:users){
			 if(user.getLoginName().equals(name)){
				 return user;
			 }
		 }
		 
		 return null;
	}

	@Override
	public User getUserInfoById(long id) {
		return UserDAOImp.find.byId(id);
	}
	
	@Override
	public void deleteUserById(long id){
		 UserDAOImp.find.ref(id).delete();
	 }
}
