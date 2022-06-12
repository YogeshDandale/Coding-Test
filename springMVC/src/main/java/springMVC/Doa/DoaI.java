package springMVC.Doa;

import java.util.List;

import springMVC.model.Student;

public interface DoaI {

	public int savedata(Student s);

	public List<Student> getData();

}
