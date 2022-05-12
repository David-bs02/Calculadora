package interfacesImp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfaces.Suma;

public class ClientImp {
    public void ConectServer() {
        try {
            int resultado_suma;
            int resultado_rest;
            int resultado_multi;
            int resultado_div;

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9090);
            Suma suma = (Suma) registry.lookup("Operaciones");

            resultado_suma = suma.suma(4, 2);
            resultado_rest = suma.resta(4, 2);
            resultado_multi = suma.multiplicacion(4, 2);
            resultado_div = suma.division(4, 2);

            System.out.println(resultado_suma);
            System.out.println(resultado_rest);
            System.out.println(resultado_multi);
            System.out.println(resultado_div);

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();

        }
    }
}
