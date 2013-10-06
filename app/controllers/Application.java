package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Student;
import play.mvc.Controller;
import play.mvc.Result;
import play.*;
import views.html.*;
public class Application extends Controller {

    public static Result index() {
    	List<String>  list = new ArrayList<String>();
    	list.add("Vidya");
    	list.add("SSVZ");
    	
    	List<Student> studentList = new ArrayList<Student>();
    	studentList.add(new Student("vidya", 111));
    	studentList.add(new Student("zeeshan",120));
    	
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
