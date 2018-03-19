package Main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server_Main {

	public static void main(String[] args) throws RemoteException {
		
		LocateRegistry.createRegistry(7777);
		
		

	}

}
