package dev.yeon.design;

import dev.yeon.design.adapter.*;
import dev.yeon.design.singleton.AClazz;
import dev.yeon.design.singleton.BClazz;
import dev.yeon.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        /*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
         */

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        SocketAdapter adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        SocketAdapter airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    // 110v 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
