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

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisConnect();
        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();

    }
}
