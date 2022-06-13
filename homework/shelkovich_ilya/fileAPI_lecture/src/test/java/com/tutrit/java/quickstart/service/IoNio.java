package com.tutrit.java.quickstart.service;

import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class IoNio {

    @Test
    public void baseFileOperations() throws IOException {
        //File file = new File("./max.txt"); //IO
        //Path path = Paths.get("./max.txt");//NIO

        // Path path2 = Paths.get("src", "main", "resources", "maximum.txt"); //такая запись пути лучше!
        // Files.createFile(path2);
        //это не создание файла, это класс
        // который содержит в себе адрес на файловой системе
        //где предпологается существует файл
        // path2.getFileName();
        //в Path я создаю где я буду читать
        // в Files я создаю сами файлы и читаю их

        //пройти по директории
        //патерн разбит на две части, можно обьединить в один стрим
        Stream<Path> src = Files.walk(Paths.get("./"));
        List<Path> result = src.collect(Collectors.toList());
        System.out.println(result);

        //прочитать файл
        Stream<String> linesAsStream = Files.lines(Paths.get("prop.properties"));
        List<String> linesAsCollection = Files.readAllLines(Paths.get("prop.properties"));
        BufferedReader linesASBufferedReadForLagreFile = Files.newBufferedReader(Paths.get("prop.properties"));
    }

    @Test
    public void fileType() throws IOException {
        BigDecimal[] prices = {new BigDecimal(10.0), new BigDecimal(20.0)};
        int[] ints = {1, 2};
        String[] texts = {"a", "b"};

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.file"))) {
            for (int i = 0; i < ints.length; i++) {
                out.writeObject(prices[i]);
                out.writeInt(ints[i]);
                out.writeUTF(texts[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //читает по строчно
    @Test
    public void fileWriter() throws IOException {
        String helloWorld = "Hello world";
        String name = "max";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("text.txt"))) {
            out.writeUTF(helloWorld);
            out.writeUTF(name);
        }
    }

    //помещает всё что есть в буфер и пользователь читает из буфера
    @Test
    public void bufferedFileWriter() throws IOException {
        String helloWorld = "Hello world\n";
        String name = "max";

        try (BufferedWriter out = new BufferedWriter(new FileWriter("buff.txt", true))) { //с аппендом файл не перезаписывается
            out.write(helloWorld);                                                                      // а в него добавляется новые данные
            out.write(name);
            out.write("\nNow I know!");
            out.flush(); // принудительно сбрасывает буфер на запись
        }
    }
}
