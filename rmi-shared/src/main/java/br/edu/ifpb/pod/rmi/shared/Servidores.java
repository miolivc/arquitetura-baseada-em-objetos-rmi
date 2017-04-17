/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.shared;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author miolivc
 */
public class Servidores {
    private Map<String,Integer> servers;
    private static int server;
    
    public Servidores(){
        servers = new HashMap<>();
        preencheMap();
    }

    private void preencheMap(){
        servers.put("node_1", new Integer(10997));
        servers.put("node_2", new Integer(10998));
        servers.put("node_3", new Integer(10999));
    }
    
    public int getServer(){
        server = new Random().nextInt(servers.size());
        return servers.get(servers.keySet().toArray()[server]);
    }
}
