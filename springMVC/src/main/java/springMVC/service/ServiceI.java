package springMVC.service;

import java.util.List;

import springMVC.model.Student;

public interface ServiceI {

	public int savedata(Student s);

	public List<Student> getData();

}
