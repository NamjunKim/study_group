package helloskeleton.skeleton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import helloskeleton.skeleton.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
