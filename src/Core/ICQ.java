package Core;

import Core.ClientModel.Client;
import Core.MessageModel.MessageModel;

class ICQ implements Chat {

    Repository repo;

    public ICQ(Repository currentRepo) {
        repo = currentRepo;
    }

    @Override
    public void sendMessage(MessageModel mm, Client me) {
        for (int i = 0; i < repo.getCount(); i++) {
            var c = repo.getById(i);
            if (c.name != me.name) {
                c.printMessage(mm);
            }
        }
    }

    @Override
    public void appendClient(Client client) {
        System.out.println("\n >>> Вошел " + client.name);
        repo.add(client);

    }
}