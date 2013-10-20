package models.userManagement;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.MinLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
@TableGenerator(name="userTable",initialValue=0,allocationSize=1)
public class User extends Model{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="userTable")
	long id;
	@Required
	@MinLength(6)
	@Column(unique=true,updatable=false)
	private String loginName ;
	
	private int isAdmin;
	
	private String position;
	
	private UserDescription description;
	
	@Required
	@Email
	@Column(unique=true)
	private String email;
	
	@MinLength(10)
	private String phoneNo;
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Required
	@MinLength(6)
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
	
}
