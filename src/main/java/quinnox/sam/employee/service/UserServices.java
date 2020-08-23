package quinnox.sam.employee.service;

import quinnox.sam.employee.entity.User;

public interface UserServices {
	void save(User user);

	User getUserByUsername(String username);
	public User get(Long id);

}
