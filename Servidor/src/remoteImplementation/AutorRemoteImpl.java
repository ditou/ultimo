package remoteImplementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import controlador.Controlador;
import dto.AutorDTO;
import remoteInterface.AutorRemote;

public class AutorRemoteImpl extends UnicastRemoteObject implements AutorRemote {

	private static final long serialVersionUID = -5331364471431274002L;

	public AutorRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public List<AutorDTO> findAllAutores() {
		return Controlador.getInstancia().findAllAutores();
	}

	@Override
	public Integer altaAutor(AutorDTO autorDTO) throws RemoteException {
		return Controlador.getInstancia().altaAutor(autorDTO);

	}

	@Override
	public void bajaAutor(Integer autorId) throws RemoteException {
		Controlador.getInstancia().bajaAutor(autorId);
	}

	@Override
	public void modificarAutor(AutorDTO autor) throws RemoteException {
		Controlador.getInstancia().modificarAutor(autor);
	}

	@Override
	public AutorDTO buscarAutor(Integer autorId) throws RemoteException {
		return Controlador.getInstancia().buscarArticulo(autorId);
	}

}
