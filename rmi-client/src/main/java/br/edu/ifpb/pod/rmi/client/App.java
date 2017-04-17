/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author miolivc
 */
public class App {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Client client = new Client();
        double x, y, result;
        int optCalc = 0;
        
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.println("Digite uma opção:\n 1- somar \n 2-Subtrair");
            optCalc = in.nextInt(); in.nextLine();
            
            System.out.println("Digite o primeiro número:");
            x = in.nextDouble(); in.nextLine();
            
            System.out.println("Digite o segundo número:");
            y = in.nextDouble(); in.nextLine();
            
            switch(optCalc){
                case 1: {
                    result = client.calculaSoma(x, y);
                    System.out.println("O resultado da soma eh: " + result);
                } break;
                case 2: {
                    result = client.calculaDiferenca(x, y);
                    System.out.println("O resultado da subtracao2 eh: " + result);
                } break;
                default: {
                    System.out.println("Você não escolheu uma opção válida "
                            + "então o sistema será encerrado...");
                    System.exit(0);
                } break;
            }
           
        } catch (Exception ex){
            System.err.println("Erro no cliente: " + ex.toString());
        }
    }
}
