package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import util.HibernateUtil;
import model.Autor;

public class AutorDAO {
	
	private static AutorDAO instance = null;
	private static SessionFactory sf = null;
	
	private AutorDAO () {
			}
	
	public static AutorDAO getInstance () {
		
		if(instance ==null) {
			instance = new AutorDAO();			
		}
		return instance;		
	}
	
	@SuppressWarnings("unchecked")
	public List<Autor> getAll(){
		List<Autor> autores = null;
		
		try {
		Session s =  HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = s.createQuery("FROM Autor");
		autores = query.list();
		s.close();
		return autores;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return autores;
	}
	
	public Autor getById(int id) {
		Autor autor = null;
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		autor = s.get(Autor.class, id);
		
		return autor;
		
	}
	
	public void saveOrUpdate(Autor autor) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.saveOrUpdate(autor);
		s.flush();
		s.close();
	}
	
	
	

}
