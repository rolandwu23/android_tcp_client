package com.eonreality.client;

public interface TCPListener {
    public void onTCPMessageRecieved(String message);
    public void onTCPConnectionStatusChanged(boolean isConnectedNow);
}
