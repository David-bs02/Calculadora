import java.rmi.registry.*;
import interfacesImp.SumaImp;

public class ServeRMI_test {
    public static void main(String[] args){
        try {
            SumaImp sumaImp = new SumaImp();
            Registry registry = LocateRegistry.createRegistry(9090);
            registry.rebind("Operaciones", sumaImp);

            System.out.println("Servidor Activo");
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
  
}