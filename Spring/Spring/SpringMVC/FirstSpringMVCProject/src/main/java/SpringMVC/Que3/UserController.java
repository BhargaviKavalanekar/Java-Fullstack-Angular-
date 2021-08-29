package SpringMVC.Que3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Que2.SI;

@Controller
public class UserController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLoginInfo(){
		ModelAndView m= new ModelAndView("Que3_login");
      return m;
   }

	@RequestMapping(value="login",method=RequestMethod.POST)
	public String ValidateLogin(@ModelAttribute("UM") UserModel u)
	{
		if (u != null && u.getUsername() != null & u.getPassword() != null) 
	    {
	      if (u.getUsername().equals("abc") && u.getPassword().equals("abc"))  {
				return "Que3_success";
			}
			else {
				return "Que3_error";
			}
		}
		else {
			return "Que3_error";
		}
	}
}
