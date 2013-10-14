package models.userManagementDAO;

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
public class Users extends Model{
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
	
	public static Finder<Long,Users> find = new
			 Finder<Long,Users>( Long.class, Users.class ); 
	
	public List<Users> listAllUsers(){
		 return Users.find.all();
	 }
	
	public Users getUserInfoById(long id){
		 return Users.find.byId(id);
	 }
	
	public Users getUserInfoByName(String name){
		 //TODO need to remove the hack around this
		 List<Users> users = Users.find.all(); 
		 for(Users user:users){
			 if(user.getLoginName().equals(name)){
				 return user;
			 }
		 }
		 
		 return null;
	 }
	 public void deleteUserById(long id){
		 Users.find.ref(id).delete();
	 }
}
