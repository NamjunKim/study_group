package helloskeleton.skeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import helloskeleton.skeleton.repository.UserRepository;
import helloskeleton.skeleton.service.UserService;

@Configuration
public class SpringConfig {
	private final UserRepository userRepository;

	@Autowired
	public SpringConfig(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Bean
	public UserService userService() {
		return new UserService(this.userRepository);
	}
	

}
