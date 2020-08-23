package quinnox.sam.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import quinnox.sam.employee.entity.Applied;
import quinnox.sam.employee.entity.Project;
import quinnox.sam.employee.entity.User;
import quinnox.sam.employee.service.AppliedService;
import quinnox.sam.employee.service.ProjectService;
import quinnox.sam.employee.service.UserServices;


@Controller

public class EmpController {
	@Autowired
	private ProjectService service;
	@Autowired
	private UserServices userService;
	@Autowired
	private AppliedService appliedService;
	
	
	 @RequestMapping(value = "/registration", method = RequestMethod.GET)
	    public String registration(Model model) {
	        model.addAttribute("user", new User());

	        return "registration";
	    }

	    @RequestMapping(value = "/registration", method = RequestMethod.POST)
	    public String registration(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
	    	 User userExists = userService.getUserByUsername(user.getUsername());
	    	 if(userExists != null) {
	    		   bindingResult.rejectValue("username", "error.user", "This user already exists!");
	    		  }

	        if (bindingResult.hasErrors()) {
	            return "registration";
	        }

	        userService.save(user);

	        return "redirect:/registration?success";
	    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {

        return "login";
    }
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	
		return "index";
	}
	@RequestMapping("/view")
	public String viewProject(Model model)
	{
		List<Project> listProject = service.listAll();
		model.addAttribute("listProject", listProject);
			return "view_project";
		
	}
	
	
	
	
	
	@RequestMapping("/exit")
	public String exitProject(Model model) {
		return "index";
	}
	
	
	
	
	@RequestMapping("/apply")
	public String applyproject(Model model){

		Applied applied = new Applied();
		model.addAttribute("applied", applied);	
		return "apply";
	}
	
	@RequestMapping(value = "/saveapplication", method = RequestMethod.POST)
	public String saveapplication(@ModelAttribute("applied") Applied applied,Model model) {
		appliedService.save(applied);
		return "redirect:/";
	}
	
	
	@RequestMapping("/exitapplied")
	public String exitApplied(Model model) {
		return "index";
	}
	

}
