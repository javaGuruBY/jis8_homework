package com.tutrit.java.quickstart.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class IoNio {

    @Test
    public void baseFileOperation() throws IOException {
        Path path = Paths.get("src", "main", "resources", "max.txt");
        path.getFileName();

        Stream<Path> src = Files.walk(Paths.get("./"));
        List<Path> result = src.collect(Collectors.toList());
        System.out.println(result);


        Stream<String> linesAsStream = Files.lines(Paths.get("log4j.log"));
        List<String> linesAsCollection = Files.readAllLines(Paths.get("log4j.log"));
        BufferedReader linesAsBuffereadReadForLargeFile = Files.newBufferedReader(Paths.get("log4j.log"));
        linesAsBuffereadReadForLargeFile.readLine();
    }

    @Test
    public void fileType() throws IOException {
        BigDecimal[] prices = {new BigDecimal(10.0), new BigDecimal(20.0)};
        int[] ints = {1, 2,};
        String[] texts = {"a", "b"};

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("data.file"));
            for (int i = 0; i < ints.length; i++) {
                out.writeObject(prices[i]);
                out.writeInt(ints[i]);
                out.writeUTF(texts[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

    @Test
    public void fileWriter() throws IOException {
        String helloWorld = "Hello World\n";
        String name = "max";

        try (BufferedWriter out = new BufferedWriter(new FileWriter("text.txt", true))) {
            out.write(helloWorld);
            out.write(name);
            out.write("\n\t\tCool!!");
            out.flush();
        }
    }
}
