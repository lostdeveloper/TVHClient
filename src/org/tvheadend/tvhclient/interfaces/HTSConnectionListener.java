package org.tvheadend.tvhclient.interfaces;

import org.tvheadend.tvhclient.htsp.HTSMessage;

/**
 * 
 * @author john-tornblom
 * @author Robert Siebert
 */
public interface HTSConnectionListener {

    /**
     * This method is invoked by the HTSConnection class. Whenever the server
     * sends a new message the listeners will be informed.
     * 
     * @param response
     */
    public void onMessage(HTSMessage response);

    /**
     * This method is invoked by the HTSConnection class. Whenever the server
     * encounters an error or sends one the listeners will be informed.
     * 
     * @param errorCode
     */
    public void onError(int errorCode);
    
    /**
     * This method is invoked by the HTSConnection class. Whenever the server
     * encounters a connection state change the listeners will be informed.
     * 
     * @param errorCode
     */
    public void onConnectionState(String state);
}
