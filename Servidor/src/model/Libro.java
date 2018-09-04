package model;


public class Libro {

	private Long id;
	private String titulo;
	private Autor autor;
	
	
	public Libro () {
		
	}
	
	public Libro(Long id, String titulo, Autor autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor.getNombre() + "]";
	}
	
	
	
	

}
