package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.UserDaoRpository;
import model.User;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserDaoRpository userRepo;
	@PostMapping("/user/signup")
	public void add(@RequestBody User user) {
		user.setUserRole("user");
		userRepo.save(user);
	}
	@GetMapping("users")
	public List<User> getAllUsers(){
		
		return userRepo.findAll();
	}
	
}
