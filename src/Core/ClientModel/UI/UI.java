package Core.ClientModel.UI;

import Core.ClientModel.Client;

public class UI {
    public void UserDontHave() {
        System.out.println("Такого юзера нет в группе");
    }

    public void AlreadyInGroup() {
        System.out.println("Он уже в группе");
    }

    public void JoinInGroup(String name) {
        System.out.println("\n >>> Вошел в чат " + name);
    }

    public void printInfo(String client, int id) {
        System.out.printf("name: %s id: %s\n", client, id++);
    }

    public void kickUser(String name) {
        System.out.printf(name + " Удалён из группы\n");
    }

    public void printMessage(String name,String msg) {
        System.out.printf("User‚ %s: %s\n", name, msg);
    }

    public void checkAllMessages(String text) {
        System.out.println(text);
    }
}
