package gateways;

import models.Client;

public class ClientGateway extends SimpleGateway<Client> {
    public ClientGateway(){
        this.insert(new Client("Nova", "Strike",20,1));
    }
}
