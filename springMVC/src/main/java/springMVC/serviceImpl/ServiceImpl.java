package springMVC.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.Doa.DoaI;
import springMVC.model.Student;
import springMVC.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	DoaI i;
	@Override
	public int savedata(Student s) {
		
		return i.savedata(s);
		
	}
	@Override
	public List<Student> getData() {
		 List<Student> l=i.getData();
		return l;
	}

}
