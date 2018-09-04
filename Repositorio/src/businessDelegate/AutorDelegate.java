package businessDelegate;


import exception.GenericRemoteException;

import remoteInterface.AutorRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import dto.AutorDTO;

public class AutorDelegate {
    private static AutorDelegate instancia;

    private AutorRemote autorRemote;

    private AutorDelegate() throws GenericRemoteException {
        try {
            autorRemote = (AutorRemote) Naming.lookup("AutorRemote");
        } catch (MalformedURLException e) {
            throw new GenericRemoteException(e);
        } catch (RemoteException e) {
            throw new GenericRemoteException(e);
        } catch (NotBoundException e) {
            throw new GenericRemoteException(e);
        }
    }

    public static AutorDelegate getInstancia() throws GenericRemoteException {
        if (instancia == null) {
            instancia = new AutorDelegate();
        }
        return instancia;
    }

    public List<AutorDTO> findAllAutores() throws GenericRemoteException {
        try {
            return autorRemote.findAllAutores();
        } catch (RemoteException e) {
            throw new GenericRemoteException(e);
        }
    }

    public void altaAutor(AutorDTO autor) throws GenericRemoteException {
        try {
            autorRemote.altaAutor(autor);
        } catch (RemoteException e) {
            throw new GenericRemoteException(e);
        }
    }

    public void bajaAutor(Integer autorId) throws GenericRemoteException {
        try {
            autorRemote.bajaAutor(autorId);
        } catch (RemoteException re) {
            throw new GenericRemoteException(re);
        }
    }

    public void modificarAutor(AutorDTO autor) throws GenericRemoteException {
        try {
            autorRemote.modificarAutor(autor);
        } catch (RemoteException re) {
            throw new GenericRemoteException(re);
        }
    }

    public AutorDTO buscarAutor(Integer autorId) throws GenericRemoteException {
        try {
            return autorRemote.buscarAutor(autorId);
        } catch (RemoteException re) {
            throw new GenericRemoteException(re);
        }
    }
}
