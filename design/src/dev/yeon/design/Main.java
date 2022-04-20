package dev.yeon.design;

import dev.yeon.design.singleton.AClazz;
import dev.yeon.design.singleton.BClazz;
import dev.yeon.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
