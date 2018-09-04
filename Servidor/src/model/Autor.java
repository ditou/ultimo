package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import dto.AutorDTO;


public class Autor {
	
	private Long id;
	private String nombre;
	private String nacionalidad;
	private List<Libro> libros = new ArrayList<>();

	
	public Autor() {
		
	}

	public List<Libro> getLibros(){
		return libros;
	}
	public void setLibros (List<Libro> libros) {
		this.libros = libros;
	}
	
	public void addLibro(Libro libro) {
		if(!libros.contains(libro)) {
			libros.add(libro);
			libro.setAutor(this);
		}
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public Autor(Long id, String nombre, String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}

	public AutorDTO toDTO() {
		return new AutorDTO(id, nombre, nacionalidad);
	}
	
	
	
}
