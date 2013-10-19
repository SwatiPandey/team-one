package models.userManagement;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.avaje.ebean.ExpressionList;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
@TableGenerator(name="userTable",initialValue=0,allocationSize=1)
public class User extends Model{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="userTable")
	long id;
	@Required
	private String loginName ;
	
	private int isAdmin;
	
	private String position;
	
	private UserDescription description;
	@Required
	private String email;
	
	private String phoneNo;
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Required
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public String getEmai() {
		return email;
	}
	public void setEmail(String emailID) {
		this.email = emailID;
	}
	
	@Embedded
	public UserDescription getDescription() {
		return description;
	}
	public void setDescription(UserDescription description) {
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int isAdmin() {
		return isAdmin;
	}
	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public static Finder<Long,User> find = new
			 Finder<Long,User>( Long.class, User.class ); 
	
	public List<User> listAllUsers(){
		 return User.find.all();
	 }
	
	public User getUserInfoById(long id){
		 return User.find.byId(id);
	 }
	
	public User getUserInfoByLoginName(String loginName){
		 //TODO need to remove the hack around this
		 List<User> users = User.find.all(); 
		 for(User user:users){
			 if(user.getLoginName().equals(loginName)){
				 return user;
			 }
		 }
		 
		 return null;
	 }
	 public void deleteUserById(long id){
		 User.find.ref(id).delete();
	 }
}
