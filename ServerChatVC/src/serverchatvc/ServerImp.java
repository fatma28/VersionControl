/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverchatvc;

import interfacechatvc.ClientInt;
import interfacechatvc.ServerInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

/**
 *
 * @author fatma
 */
public class ServerImp extends UnicastRemoteObject implements ServerInt{
   
    ServerImp()throws RemoteException{}
    
    ClientInt clientInt= new ClientInt();
    
    Vector<ClientInt> clientList= new Vector<>();
    

    @Override
    public void register(ClientInt clientInt) {
        clientList.add(clientInt);
    }

    @Override
    public void tellOther(ClientInt clientInt) {
        for(ClientInt clientint: clientList ){
            
        }
    }

    @Override
    public void unRegister(ClientInt clientIn) {
        clientList.remove(clientIn);
    }


}
