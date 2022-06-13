package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Zip;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Zip zip = new Zip();
        zip.zipWrite();
        zip.zipRead();
        zip.zipRead2();
    }
}

