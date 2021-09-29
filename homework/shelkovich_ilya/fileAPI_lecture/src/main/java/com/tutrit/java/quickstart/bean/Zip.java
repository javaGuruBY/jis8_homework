package com.tutrit.java.quickstart.bean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Zip {

    public void zipWrite() throws IOException {
        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream("test.zip"))) {
            ZipEntry entry = new ZipEntry("test.txt");
            out.putNextEntry(entry);
            out.write("Hello, World!".getBytes());
            ZipEntry entry1 = new ZipEntry("hello.txt");
            out.putNextEntry(entry1);
            out.write("Otkroi pod'ezd".getBytes());
        }
    }

    public void zipRead() throws IOException {
        try (ZipInputStream in = new ZipInputStream(new FileInputStream("test.zip"))) {
            ZipEntry entry;
            while ((entry = in.getNextEntry()) != null) {
                System.out.println("File: " + entry.getName());
                byte[] buffer = new byte[128];
                int bytes = in.read(buffer);
                while (bytes != -1) {
                    System.out.println(new String(buffer, 0, bytes));
                    bytes = in.read(buffer);
                }
            }
        }
    }

    public void zipRead2() throws IOException {
        ZipFile zipFile = new ZipFile("test.zip");

        Enumeration<? extends ZipEntry> entries = zipFile.entries();

        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            InputStream stream = zipFile.getInputStream(entry);
            System.out.println("File: " + entry.getName());
            byte[] buffer = new byte[128];
            int bytes = stream.read(buffer);
            while (bytes != -1) {
                System.out.println(new String(buffer, 0, bytes));
                bytes = stream.read(buffer);
            }
        }
    }
}
