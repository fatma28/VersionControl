/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverchatvc;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatma
 */
public class ServerChatVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry();
            ServerImp serverImp = new ServerImp();

            reg.rebind("chatService", serverImp);

        } catch (RemoteException ex) {
            Logger.getLogger(ServerChatVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
