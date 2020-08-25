package quinnox.sam.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import quinnox.sam.employee.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public quinnox.sam.employee.entity.User getUserByUsername(@Param("username") String username);






}
