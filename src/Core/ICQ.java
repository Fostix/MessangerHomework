package Core;

import Core.ClientModel.Client;
import Core.ClientModel.UI.UI;
import Core.DataModel.BaseStorage;
import Core.DataModel.DbMessages;
import Core.DataModel.DbUsers;
import Core.MessageModel.MessageModel;
import Core.MessageModel.TxtMessage;

class ICQ implements Chat {
    private DbUsers repo;
    private DbMessages msgRep;
    private UI ui = new UI();

    /** Creates a messenger so that users can communicate with each other
     * @param currentRepo database for users
     * @param objectDbMessages message database */
    public <M extends MessageModel> ICQ(DbUsers currentRepo, DbMessages<M> objectDbMessages) {
        repo = currentRepo;
        msgRep = objectDbMessages;
    }

    /** Creates a messenger so that users can communicate with each other  */
    @Override
    public void sendMessage(MessageModel mm, Client me) {
        if (!repo.equals(me)) {
            ui.UserDontHave();
            return;
        }
        for (Object client : repo) {
            if (!client.equals(me)) {
                ui.printMessage(client.toString(), mm.play());
            }
        }
        msgRep.add(new TxtMessage(me + " send: " + mm));
    }


    /** allows you to add a user to the messenger group */
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

    @Override
    public void checkAllMessages() {
        for (var msg : msgRep) {
            ui.checkAllMessages(msg.toString());
        }
    }
}