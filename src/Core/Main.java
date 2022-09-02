package Core;

import Core.ClientModel.Client;
import Core.ClientModel.RegularUser;
import Core.DataModel.Db;

//Доработать "мессенджер" разработанный на семинаре
//        добавив
//        - абстрактных пользователей
//        - абстрактное хранилище
//        - абстрактные модели сообщения
//
//        продумать иерархию пользователей наделив их разными правами например админ, может удалять из чата других пользователей
public class Main {
    public static void main(String[] args) {
        ICQ icq = new ICQ(new Db());
        Client client1 = new RegularUser("Барсук");
        client1.join(icq);
        Client client2 = new RegularUser("Бахрума", icq);
        Client client4 = new RegularUser("Партернак", icq);

        // icq.appendClient(client1);
        // icq.appendClient(client2);
        client1.sendTxtMsg("Привет всем!"); // Барсук
        client2.sendTxtMsg("Ну привет!"); // Бахрума
        Client client3 = new RegularUser("Вася", icq);
        client3.sendAudioMsg("bla_bla.mp3");
        client3.sendImageMsg("photo.jpeg");

    }
}