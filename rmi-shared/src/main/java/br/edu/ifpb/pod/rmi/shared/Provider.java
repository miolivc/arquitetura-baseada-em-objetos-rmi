/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.shared;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author miolivc
 */
public class Provider {
    private static int server;
    private Registry registry;
    
    public Provider() throws RemoteException {
        registry = getRegistry();
    }
    
    public Calculadora getCalculadora() throws NotBoundException, RemoteException{
        Calculadora calculadora = (Calculadora) registry.lookup("Calculadora");
        System.out.print("O server escolhido foi: " + server);
        return calculadora;
    }
    
    private static Registry getRegistry() throws RemoteException{
        server = new Servidores().getServer();
        return LocateRegistry.getRegistry(server);
    }

    public Calculadora getServer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
