/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_1;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author miolivc
 */
public class Servidor {
    public static int port = 10997;
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(port);
            Somador somador = new Somador();
            registry.bind("Calculadora", somador);
            System.out.println("Servidor ativo!");
        } catch (RemoteException | AlreadyBoundException ex) {
            System.err.println("Erro no Servidor: " + ex.toString());
        }
        
    }
    
}
