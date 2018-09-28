/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import interfaz.irCalculadora;
import java.rmi.RemoteException;

/**
 *
 * @author javier
 */

public class Calculadora implements irCalculadora{
    public Calculadora(){
        super();
    }
    

    @Override
    public int factorial(int n) throws RemoteException {
       int i,fact;
       fact=1;
       for(i=1;i<=n;i++){
           fact=i*fact;
       }
       return fact;
    }

    @Override
    public float potencia(int base, int exponente) throws RemoteException {
        float Potencia;
        int k;
        if(base==0)Potencia=0;
        else{
            Potencia=1;
        for(k=0;k<exponente;k++)Potencia*=base; 
        }
         return Potencia;
    }

    @Override
    public String saludos(String nombre) throws RemoteException {
       String saludo="hola mundo";
       return saludo;
    }

   
}
