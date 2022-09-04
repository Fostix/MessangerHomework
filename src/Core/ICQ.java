package Core;

import Core.ClientModel.Client;
import Core.ClientModel.UI.UI;
import Core.DataModel.Db;
import Core.MessageModel.MessageModel;

class ICQ implements Chat {

    private Db repo;
    private UI ui = new UI();

    public ICQ(Db currentRepo) {
        repo = currentRepo;
    }

    @Override
    public void sendMessage(MessageModel mm, Client me) {
        if (!repo.equals(me)) {
            ui.UserDontHave();
            return;
        }
        for (Object client : repo) {
            if (!client.equals(me)) {
                ui.printMessage(client.toString(), mm.toString());
            }
        }
    }

    @Override
    public void appendClient(Client c) {
        if (repo.equals(c)) {
            ui.AlreadyInGroup();
            return;
        }
        ui.JoinInGroup(c.getName());
        repo.add(c);
    }

    @Override
    public void printInfo() {
        int id = 0;
        for (var client : repo) {
            ui.printInfo(client.toString(), id++);
        }
    }

    @Override
    public void removeUser(int id) {
        ui.kickUser(repo.remove(id));
    }
}