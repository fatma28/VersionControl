/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacechatvc;

/**
 *
 * @author fatma
 */
public interface ServerInt {
    public abstract void register(ClientInt clientInt);
    public abstract void tellOther(ClientInt clientInt);
    public abstract void unRegister(ClientInt clientInt);
}
