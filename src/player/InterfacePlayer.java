package player;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Rafael
 */
public interface InterfacePlayer extends Remote{
    
    public int jogarDado(int d) throws RemoteException;
}
