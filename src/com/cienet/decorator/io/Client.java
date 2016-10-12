package com.cienet.decorator.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Client {

    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        InputStream inputStream = new BufferedInputStream(new DataInputStream(System.in));
        @SuppressWarnings("resource")
        OutputStream outputStream = new SkipSpaceOutputStream(new DataOutputStream(System.out));
        System.out.println("Please input your word: ");
        int n;
        try {
            n = inputStream.read(buffer, 0, buffer.length);
            for (int i = 0; i < n; i++) {
                outputStream.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
