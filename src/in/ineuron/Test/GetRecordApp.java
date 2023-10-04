package in.ineuron.Test;

import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.Student;
import in.ineuron.Util.HibernateUtil;

public class GetRecordApp {

	public static void main(String[] args) throws IOException {
		
		Session session=null;
		int id=1;
		
		try {
		session=HibernateUtil.geSession();
		
		if(session !=null)
		{
			Student student=session.get(Student.class, id);
			if(student!=null)
			System.out.println(student);
			else
				System.out.println("Record not found for given id");
			
		}
		}catch (HibernateException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			
			}
			
		
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}


