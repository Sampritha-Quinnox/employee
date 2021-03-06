package quinnox.sam.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Column(name = "project_id")
	private Long id;
	@Column(name = "project_name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "location")
	private String location;
	@Column(name = "vacancy")
	private int vacancy;
	
	public Project() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getVacancy() {
		return vacancy;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	

}
