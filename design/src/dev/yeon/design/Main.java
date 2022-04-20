package dev.yeon.design;

import dev.yeon.design.adapter.*;
import dev.yeon.design.aop.AopBrowser;
import dev.yeon.design.decorator.*;
import dev.yeon.design.observer.Button;
import dev.yeon.design.observer.IButtonListener;
import dev.yeon.design.proxy.Browser;
import dev.yeon.design.proxy.BrowserProxy;
import dev.yeon.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");


    }
}
