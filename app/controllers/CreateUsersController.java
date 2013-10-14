package controllers;

import models.userManagementDAO.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import teamOneApi.TeamOneGUIAPI;
import views.html.*;

public class CreateUsersController extends Controller{
	private static TeamOneGUIAPI api = new TeamOneGUIAPI();
	final static Form<Users> signUpForm = new Form<Users>(Users.class);
	
	public static Result signUp(){
		return ok(createUser.render(signUpForm));
	}
	
	public static Result submit(){
		Form<Users> filledForm = signUpForm.bindFromRequest();
		 if(filledForm.hasErrors()){
			 return badRequest(createUser.render(filledForm));
		 }
		 Users created= filledForm.get();
		 if("true".equals(filledForm.field("isAdmin").value())) {
			 	created.setAdmin(1);
		 }
		 
		created.save();
		//TODO:need to route it to diff page that show that the user is created
		return ok("hi");
	}
	
	public static Result displayAllUsers(){
	
		return ok(displayAllUsers.render(api.displayAllUsers()));
	}

}
