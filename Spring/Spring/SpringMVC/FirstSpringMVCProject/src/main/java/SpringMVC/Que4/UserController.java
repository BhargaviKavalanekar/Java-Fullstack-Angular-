package SpringMVC.Que4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView Registration(){
		ModelAndView m= new ModelAndView("Que4_Registration");
      return m;
   }
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView pringTheMessage(@ModelAttribute("u") UserModel u)
	{
		if((u.getUserName().equals("Bhargavi"))&&(u.getPassword().equals("abc"))&& (u.getEmail().equals("bk@gmail.com"))) {
			
			List<String> list=new ArrayList<String>();
			list.add(u.getUserName());
			list.add(u.getPassword());
			list.add(u.getPassword());
			
			ModelAndView m1= new ModelAndView("Que4_login");
			m1.addObject("val"," Your Data is Stored in the database.");
			return m1;
		}
		else
		{
			ModelAndView m2= new ModelAndView("Que4_error");
			m2.addObject("error","Registration Failed!. Try Again.");
			return m2;
		}
   }
	
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView pringTheMessage1(@ModelAttribute("u") UserModel u)
	{
		
		if((u.getUserName().equals("Bhargavi"))&&(u.getPassword().equals("abc"))) {
			
			ModelAndView m1= new ModelAndView("Que4_success");
			m1.addObject("success","Login Success!");
			return m1;
		}
		else
		{
			ModelAndView m2= new ModelAndView("Que4_error");
			m2.addObject("error","Login Failed!. Try Entering valid credentials.");
			return m2;
		}
   }
}