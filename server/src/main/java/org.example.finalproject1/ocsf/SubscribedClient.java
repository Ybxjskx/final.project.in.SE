package org.example.finalproject1.ocsf;

public class SubscribedClient {
    private ConnectionToClient client;

    public SubscribedClient(ConnectionToClient client) {
        this.client = client;
    }

    public ConnectionToClient getClient() {
        return client;
    }

    public void setClient(ConnectionToClient client) {
        this.client = client;
    }
}