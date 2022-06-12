package springMVC.DoaImpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import springMVC.Doa.DoaI;
import springMVC.model.Student;

@Repository
public class DoaImpl implements DoaI {
	
	@Autowired
	SessionFactory sf;

	@Override
	public int savedata(Student s) {
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(s);
		tr.commit();
		session.close();
		return 0;
		
	}

	@Override
	public List<Student> getData() {
		
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> result = (List<Student>) query.list();
		tr.commit();
		session.close();
		return result;
	}
	
	

}
