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
        if (!repo.equals(me)) {
            System.out.println("Такого юзера нет в группе");
            return;
        }
        for (Object client : repo) {
            if (!client.equals(me)) {
                ((Client) client).printMessage(mm);
            }
        }
    }

    @Override
    public void appendClient(Client c) {
        if (repo.equals(c)) {
            System.out.println("Он уже в группе");
            return;
        }
        System.out.println("\n >>> Вошел в чат " + c.getName());
        repo.add(c);
    }

    @Override
    public void printInfo() {
        int id = 0;
        for (var client : repo) {
            System.out.printf("name: %s id: %s\n", client, id++);
        }
    }

    @Override
    public void removeUser(int id) {
        repo.remove(id);
    }
}