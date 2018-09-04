package controlador;

import java.util.ArrayList;
import java.util.List;

import dao.AutorDAO;
import dto.AutorDTO;
import model.Autor;

public class Controlador {
	
private static Controlador instancia;
	
	private Controlador(){ }
	
	public static Controlador getInstancia(){
		if(instancia == null)
			instancia = new Controlador();
		return instancia;
	}
	
	public void agregarAutor(Long id, String nombre, String nacionalidad){
		try {
			Autor a = new Autor();
			a.setId(id);
			a.setNacionalidad(nacionalidad);
			a.setNombre(nombre);
			AutorDAO.getInstance().saveOrUpdate(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*	
	public float obtenerSaldoCuenta(int numeroCuenta){
		try {
			Cuenta cuenta = CuentaDAO.getInstance().getById(numeroCuenta);
			return cuenta.obtenerSaldo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	*/
	/*
	public float obtenerSaldoCliente(int numeroCliente){
		System.out.println("con - saldoCliente - id: " + numeroCliente);
		try {
			Cliente cliente = ClienteDAO.getInstance().getById(numeroCliente);
			return cliente.obtenerSaldo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	*/
	
	public List<AutorDTO> listarAutores() {
		try {
			List<AutorDTO> au = new ArrayList<AutorDTO>();
			for (Autor autores : AutorDAO.getInstance().getAll()) {
				au.add(autores.toDTO());
			}
			return au;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	public List<CuentaDTO> listarCuentas() {
		try {
			List<CuentaDTO> dtos = new ArrayList<CuentaDTO>();
			for (Cuenta cuenta : CuentaDAO.getInstance().getAll()) {
				dtos.add(cuenta.toDTO());
			}
			return dtos;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
	*/

	public List<AutorDTO> findAllAutores() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer altaAutor(AutorDTO autorDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public void bajaAutor(Integer autorId) {
		// TODO Auto-generated method stub
		
	}

	public void modificarAutor(AutorDTO autor) {
		// TODO Auto-generated method stub
		
	}

	public AutorDTO buscarArticulo(Integer autorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
