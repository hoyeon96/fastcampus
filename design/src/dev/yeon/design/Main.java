package dev.yeon.design;

import dev.yeon.design.adapter.*;
import dev.yeon.design.aop.AopBrowser;
import dev.yeon.design.decorator.*;
import dev.yeon.design.facade.Ftp;
import dev.yeon.design.facade.Reader;
import dev.yeon.design.facade.SftpClient;
import dev.yeon.design.facade.Writer;
import dev.yeon.design.observer.Button;
import dev.yeon.design.observer.IButtonListener;
import dev.yeon.design.proxy.Browser;
import dev.yeon.design.proxy.BrowserProxy;
import dev.yeon.design.proxy.IBrowser;
import dev.yeon.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        // base 64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
}
