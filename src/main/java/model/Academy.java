package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Academy {
	@Id
	Integer id;
	String name;
	String[] courses;
	public Academy() {
		// TODO Auto-generated constructor stub
	}
	
	public Academy(Integer id, String name, String[] courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	
	
}
