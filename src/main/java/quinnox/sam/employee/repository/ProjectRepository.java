package quinnox.sam.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import quinnox.sam.employee.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	List<Project> findByname(String name);

}
