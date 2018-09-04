package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import remoteImplementation.AutorRemoteImpl;
import remoteInterface.AutorRemote;


public class Server {

    public Server() {
        iniciar();
    }

    public static void main(String[] args) {
        new Server();
    }

    public void iniciar() {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

            AutorRemote autorRemote = new AutorRemoteImpl();
       
            
            Naming.bind("//localhost:1088/AutorRemote", autorRemote);
            
            System.out.println("Servicios registrados exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
