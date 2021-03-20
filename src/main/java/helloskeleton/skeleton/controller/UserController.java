package helloskeleton.skeleton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import helloskeleton.skeleton.domain.User;
import helloskeleton.skeleton.service.UserService;

@Controller
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
		
	@GetMapping("/users")
	@ResponseBody
	public List<User> findAllUsers(){
		return userService.findAllUsers();
	}
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public User findOneUser(@PathVariable("id") Long id){
		return userService.findOneUser(id);
	}
	

}
