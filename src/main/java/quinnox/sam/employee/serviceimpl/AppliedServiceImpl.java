package quinnox.sam.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quinnox.sam.employee.entity.Applied;
import quinnox.sam.employee.repository.AppliedRepository;
import quinnox.sam.employee.service.AppliedService;

@Service

public class AppliedServiceImpl implements AppliedService {
	@Autowired 
	AppliedRepository appliedrepo;
	
	@Override
	public List<Applied> listAll() {
		// TODO Auto-generated method stub
		return appliedrepo.findAll();
	}

	@Override
	public Applied save(Applied applied) {
		// TODO Auto-generated method stub
		return appliedrepo.save(applied);
	}

	@Override
	public Applied get(Long id) {
		// TODO Auto-generated method stub
		return appliedrepo.findById(id).get();
	}

	@Override
	public List<Applied> findappliedByprojectname(String projectname) {
		// TODO Auto-generated method stub
		return appliedrepo.findByprojectname(projectname);
	}

}
