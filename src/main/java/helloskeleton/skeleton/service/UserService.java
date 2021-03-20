package helloskeleton.skeleton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import helloskeleton.skeleton.domain.User;
import helloskeleton.skeleton.repository.UserRepository;

public class UserService {
	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
		
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	public User findOneUser(Long id) {
		return userRepository.findById(id).get();
	}
	
}
