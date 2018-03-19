package Main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server_Main {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		LocateRegistry.createRegistry(7777);
		
		Remote remote = (Remote) new Model();
		Naming.rebind("//localhost:7777/game", remote);
		System.out.println("Server start...");
	}

}
