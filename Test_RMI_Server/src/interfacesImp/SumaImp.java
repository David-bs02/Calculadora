package interfacesImp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.Suma;

public class SumaImp extends UnicastRemoteObject implements Suma {

    public SumaImp() throws RemoteException {
        super();
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        return a + b ;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return a * b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return a / b;
    }
  
}