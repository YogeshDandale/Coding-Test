package springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springMVC.model.Student;
import springMVC.service.ServiceI;

@org.springframework.stereotype.Controller
public class Controller {

	
	@Autowired
	ServiceI si;
	@RequestMapping("/")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/reg")
	public String reg() {
		
		return "register";
	}
	@RequestMapping("/eid")
	public String findbyid() {
		
		return "successid";
	}
	
	@RequestMapping("/regp")
	public String post(@ModelAttribute Student s,Model m) {
		
		int id=si.savedata(s);
		List<Student> l=si.getData();
		m.addAttribute("data",l);
		if(id>0)
		{
			return "login";
		}
		else
		{
			return "success";	
		}
	}

}
