/*
 * To change this license header, choose License Headers in Project Properties.
 */
package interfaz;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author javier
 */
public interface irCalculadora extends Remote{
      int factorial(int n) throws RemoteException;
      float potencia(int base,int exponente)throws RemoteException;
      String saludos(String nombre) throws RemoteException;

}
