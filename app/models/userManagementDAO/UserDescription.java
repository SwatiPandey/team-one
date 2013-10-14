package models.userManagementDAO;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Embeddable
public class UserDescription{
	
	@Required
	private String realFirstName;
	private String realMiddleName;
	@Required
	private String realLastName;
	private String address;
	private String aboutMyself;
	
	public String getRealFirstName() {
		return realFirstName;
	}
	public void setRealFirstName(String realFirstName) {
		this.realFirstName = realFirstName;
	}
	public String getRealMiddleName() {
		return realMiddleName;
	}
	public void setRealMiddleName(String realMiddleName) {
		this.realMiddleName = realMiddleName;
	}
	public String getRealLastName() {
		return realLastName;
	}
	public void setRealLastName(String realLastName) {
		this.realLastName = realLastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComments() {
		return aboutMyself;
	}
	public void setComments(String comments) {
		this.aboutMyself = comments;
	} 

	
}
