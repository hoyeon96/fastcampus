package dev.yeon.design;

import dev.yeon.design.adapter.*;
import dev.yeon.design.aop.AopBrowser;
import dev.yeon.design.decorator.*;
import dev.yeon.design.proxy.Browser;
import dev.yeon.design.proxy.BrowserProxy;
import dev.yeon.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();


    }

    // 110v 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
