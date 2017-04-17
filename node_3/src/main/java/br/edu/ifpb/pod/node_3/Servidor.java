/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_3;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author miolivc
 */
public class Servidor {
    public static int port = 10999;
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(10999);
            Diferenciador diferenciador = new Diferenciador();
            registry.bind("Calculadora", diferenciador);
            System.out.println("Servidor ativo!");
        } catch (RemoteException | AlreadyBoundException ex) {
            System.err.println("Erro no Servidor: " + ex.toString());
        }
        
    }
}
