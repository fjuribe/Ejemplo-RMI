package cliente;
import interfaz.irCalculadora;
//import java.rmi.NotBoundException;
//import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author javier
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // if(System.getSecurityManager()==null){
        //  System.setSecurityManager(new SecurityManager());
           
       // }
        try{
            String nombre="calculadora";
            Registry registry=LocateRegistry.getRegistry("192.168.0.106");
            irCalculadora calc=(irCalculadora)registry.lookup(nombre);
            System.out.println(calc.saludos("braulio"));
            System.out.println("potencia:"+calc.potencia(2,4));
        }catch(Exception e){
            System.err.println("error en el cliente");
            
        }
    }
    
}
