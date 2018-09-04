package remoteInterface;


import dto.AutorDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface AutorRemote extends Remote {
    List<AutorDTO> findAllAutores() throws RemoteException;

    Integer altaAutor(AutorDTO autorDTO) throws RemoteException;

    void bajaAutor(Integer autorId) throws RemoteException;

    void modificarAutor(AutorDTO autorDTO) throws RemoteException;

    AutorDTO buscarAutor(Integer autorId) throws RemoteException;



}
