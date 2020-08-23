package quinnox.sam.employee.service;

import java.util.List;

import quinnox.sam.employee.entity.Applied;



public interface AppliedService {
	public List<Applied> listAll();
	//public Applied findApplicationByUserId(User user);
	//public Applied findApplicationByProjectId(Project project);
	public Applied save(Applied applied);
	public Applied get(Long id);
	public List<Applied> findappliedByprojectname(String projectname);
}
