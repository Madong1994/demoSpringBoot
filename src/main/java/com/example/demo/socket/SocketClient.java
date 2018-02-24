package com.example.demo.socket;

import javax.persistence.Convert;
import javax.persistence.Converts;
import java.io.*;
import java.net.Socket;

/**
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.socket
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/10/9 15:26
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            String host = "120.78.49.241";  //要连接的服务端IP地址
            int port = 9003;   //要连接的服务端对应的监听端口
            Socket client = new Socket(host,port);

            Writer writer = new OutputStreamWriter(client.getOutputStream());
//            char[] test = new char[]{(char) 0xDB, (char) 0xB8, (char) 0xF9, (char) 0x40};
//            writer.write(test);*/
            writer.write("kkkkkkkkkkkkkkkkkkkk");

            writer.flush();//写完后要记得flush
            writer.close();
        }
    }
}
