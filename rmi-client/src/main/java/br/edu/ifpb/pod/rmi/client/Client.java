/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.client;

import br.edu.ifpb.pod.rmi.shared.Calculadora;
import br.edu.ifpb.pod.rmi.shared.Provider;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author miolivc
 */
public class Client {
    private static Calculadora calculadora;
            
    public Client() throws RemoteException, NotBoundException {
        calculadora = new Provider().getCalculadora();
    }
    
    public double calculaSoma(double x, double y) throws RemoteException, NotBoundException {
        return calculadora.sum(x, y);
    }
    
    public double calculaDiferenca(double x, double y) throws RemoteException, NotBoundException{
        return calculadora.diff(x, y);
    }
    
}
