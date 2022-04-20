package dev.yeon.design;

import dev.yeon.design.adapter.*;
import dev.yeon.design.aop.AopBrowser;
import dev.yeon.design.proxy.Browser;
import dev.yeon.design.proxy.BrowserProxy;
import dev.yeon.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();


        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();


        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()-> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()-> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }

    // 110v 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
