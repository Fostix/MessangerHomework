package Core;

import Core.ClientModel.*;
import Core.DataModel.Db;

//Доработать "мессенджер" разработанный на семинаре
//        добавив
//        - абстрактных пользователей
//        - абстрактное хранилище
//        - абстрактные модели сообщения
//
//        продумать иерархию пользователей наделив их разными правами например админ, может удалять из чата других пользователей
//* Хотелось бы увидеть обобщение в этом задание(
//        * GsonParse если в методе catch блоки одинаковые, то может их стоит объединить?
public class Main {
    public static void main(String[] args) {
        ICQ icq = new ICQ(new Db());
        Client client0 = new Admin("Арбуз", icq);
        Client client1 = new PremiumUser("Барсук");
        client1.join(icq);
        client1.join(icq);
        var client2 = new Donate("Бахрума", icq);
        Client client4 = new RegularUser("Партернак", icq);

        // icq.appendClient(client1);
        // icq.appendClient(client2);
        ((RegularUser) client2).sendTxtMsg("Привет всем!"); // Барсук
        ((RegularUser) client2).sendTxtMsg("Ну привет!"); // Бахрума
        var client3 = new Donate("Вася", icq);
        Client client5 = new PremiumUser("Барсук", icq);
        ((PremiumUser) client1).sendAudioMsg("bla_bla.mp3");
        //client5.sendAudioMsg("bla_bla.mp3");
        client3.sendImageMsg("photo.jpeg");
        ((PremiumUser) client1).sendVideoMsg("song.mp3", "video.mp4");
//        ((Admin) client0).getId();
        client2.sendAudioMsg("А вот так тоже можно");
        System.out.println(String.format("-").repeat(60));
        ((Admin) client0).printInfo();
        ((Admin) client0).removeUser(1);
        ((Admin) client0).printInfo();
        System.out.println(String.format("-").repeat(60));
        ((Admin) client0).removeUser(0);
        ((Admin) client0).printInfo();
        ((PremiumUser) client1).sendAudioMsg("bla_bla.mp3");
        ((PremiumUser) client1).sendAudioMsg("bla_bla.mp3");
        ((Admin) client0).printInfo();


        //client1.sendTxtMsg("nlsa");
    }
}