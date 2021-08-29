package SpringMVC.Que8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView  LoginPage(){
		ModelAndView m= new ModelAndView("Que8_Login");
      return m;
   }
	
	@RequestMapping(value="English_Login",method=RequestMethod.GET)
	public ModelAndView English()
	{
			ModelAndView m1= new ModelAndView("Que8_English_Login");
			return m1;
	}
	
	@RequestMapping(value="French_Login",method=RequestMethod.GET)
	public ModelAndView French()
	{
			ModelAndView m2= new ModelAndView("Que8_French_Login");
			return m2;
	}
	@RequestMapping(value="Vietnamese_Login",method=RequestMethod.GET)
	public ModelAndView Vietnamese()
	{
			ModelAndView m3= new ModelAndView("Que8_Vietnamese_Login");
			return m3;
	}
	
}