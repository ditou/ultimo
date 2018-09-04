package test;

import java.util.List;



import dao.AutorDAO;
import model.Autor;


public class TestAutores {
	
	//private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {

	//	crearDatos();
			
	//	ImprimirDatos();
		//EntityManager em = emf.createEntityManager();
		
	/*	em.getTransaction().begin();	
		
		List<Autor> autores = AutorDAO.getInstance().getAll();
		
		System.out.println("# Autores: " + autores.size());
		
		
		em.getTransaction().commit();
		
		em.close();*/
		
		List<Autor> a = AutorDAO.getInstance().getAll();
		
		System.out.println("# Autores: " + a.size());
		
		
	}
	
	

	/*static void crearDatos() {
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Autor autor1 = new Autor (1L, "Pablo Perez", "Espanol");
		Autor autor2 = new Autor (2L, "fer alonso", "argentino");
		Autor autor3 = new Autor (3L, "sami bregni", "peruana");
		
		em.persist(autor1);
		em.persist(autor2);
		em.persist(autor3);
	/*	
		em.persist(new Libro (1L, "programar en java", autor1));
		em.persist(new Libro (2L, "vestirse con estilo", autor3));
		em.persist(new Libro (3L, "cocinar sin fuego", autor1));
		em.persist(new Libro (4L, "programar en cobol es basura", autor2));
		em.persist(new Libro (5L, "programar en la paja", autor2));


		
		em.getTransaction().commit();
		
		em.close();
		
	}*/
/*	
	static void ImprimirDatos() {
		EntityManager em = emf.createEntityManager();
		
		Autor autor = em.find(Autor.class, 2L);
		List<Libro> libros = autor.getLibros();
		for (Libro libro : libros)
			System.out.println("* " + libro.toString());
		System.out.println(autor);
				
		em.close();
		
	}
	*/
}
