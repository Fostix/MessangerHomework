package Core;

import Core.ClientModel.Client;
import Core.DataModel.Db;
import Core.MessageModel.MessageModel;

class ICQ implements Chat {

    private Db repo;

    public ICQ(Db currentRepo) {
        repo = currentRepo;
    }

    @Override
    public void sendMessage(MessageModel mm, Client me) {
        for (Object ff: repo) {
            if (ff.getClass().getName() != me.getName()) {
                ((Client) ff).printMessage(mm);
            }
        }
    }

    @Override
    public void appendClient(Client client) {
        System.out.println("\n >>> Вошел в чат " + client.getName());
        repo.add(client);
    }

    @Override
    public void printInfo() {
        int id = 0;
        for (var client : repo) {
            System.out.printf("name: %s id: %s\n", client, id++);
        }
    }
    @Override
    public void getId() {
        for (var r : repo) {
        }
    }
}