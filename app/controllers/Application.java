package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.about;
import views.html.contacts;
import views.html.implinks;
import views.html.index;
import views.html.member;
public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    
    public static Result members(){
    	return ok(member.render());
    }
    
    public static Result about(){
    	return ok(about.render());
    }

    public static Result implinks(){
        return ok(implinks.render());
    }

    public static Result contacts(){
        return ok(contacts.render());
    }

}
