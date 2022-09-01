package Core;

import Core.ClientModel.Client;
import Core.DataModel.Db;

//Доработать "мессенджер" разработанный на семинаре
//        добавив
//        - абстрактных пользователей
//        - абстрактное хранилище
//        - абстрактные модели сообщения
//
//        продумать иерархию полльзователей наделив их разными правами например админ, может удалять из чата других пользователей
public class Main {
    public static void main(String[] args) {
        ICQ icq = new ICQ(new Db());
        Client client1 = new Client("Барсук");
        client1.join(icq);
        Client client2 = new Client("Бахрума", icq);
        Client client4 = new Client("Партернак", icq);

        // icq.appendClient(client1);
        // icq.appendClient(client2);
        client1.sendMsg("Привет всем!"); // Барсук
        client2.sendMsg("Ну привет!"); // Бахрума
        Client client3 = new Client("Вася", icq);

        client3.sendMsg("hello world!");
    }
}