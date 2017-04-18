/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_1;

import br.edu.ifpb.pod.rmi.shared.Calculadora;
import br.edu.ifpb.pod.rmi.shared.Provider;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author miolivc
 */
public class Somador extends UnicastRemoteObject implements Calculadora {
    
    public Somador() throws RemoteException {};
    
    @Override
    public double sum(double x, double y) throws RemoteException {
        return x + y;
    }

    @Override
    public double diff(double x, double y) throws RemoteException {
        Calculadora calculadora = null;
        try {
            calculadora = new Provider().getCalculadora();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
        return calculadora.diff(x, y);
    }
    
}
