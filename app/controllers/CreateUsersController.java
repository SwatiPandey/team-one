package controllers;

import models.userManagement.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import teamOne.common.TeamOneGUIAPI;
import views.html.userManagement.createUser;
import views.html.userManagement.displayAllUsers;

public class CreateUsersController extends Controller{
	private static TeamOneGUIAPI api = new TeamOneGUIAPI();
	final static Form<User> signUpForm = new Form<User>(User.class);
	
	public static Result signUp(){
		return ok(createUser.render(signUpForm));
	}
	
	public static Result submit(){
		Form<User> filledForm = signUpForm.bindFromRequest();
		 if(filledForm.hasErrors()){
			 return badRequest(createUser.render(filledForm));
		 }
		 User created= filledForm.get();
		 if("true".equals(filledForm.field("isAdmin").value())) {
			 	created.setAdmin(1);
		 }
		 
		created.save();
		filledForm = null;
		
		return redirect(routes.CreateUsersController.displayAllUsers());
	}
	
	public static Result displayAllUsers(){
		return ok(displayAllUsers.render(api.displayAllUsers()));
	}
	
	public static Result deleteUser(long id){
		api.deleteUserById(id);
		return redirect(routes.CreateUsersController.displayAllUsers());
	}
	
	public static Result editUser(Long id){
		Form<User> filledForm = signUpForm.bindFromRequest();
		if(filledForm.hasErrors()){
			 return badRequest(createUser.render(filledForm));
		 }
		//TODO need to remove this constant that has been attached to id
		 id = 2l;
		filledForm.get().update(id);
		return redirect(routes.CreateUsersController.displayAllUsers());
	}

}
