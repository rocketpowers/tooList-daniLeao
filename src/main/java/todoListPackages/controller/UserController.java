package todoListPackages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import todoListPackages.repository.UserRepository;
import todoListPackages.user.UserModel;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/create")
	public UserModel create(@RequestBody UserModel userModel) {
		var userCreated = this.userRepository.save(userModel);
		return userCreated;
		
		
	}

}
