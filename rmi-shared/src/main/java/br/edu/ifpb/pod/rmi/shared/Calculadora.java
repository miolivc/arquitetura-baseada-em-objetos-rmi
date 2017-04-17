
package br.edu.ifpb.pod.rmi.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    double sum(double x, double y) throws RemoteException;
    double diff(double x, double y) throws RemoteException;
}
