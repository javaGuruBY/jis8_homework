package com.tutrit.java.quickstart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    public Map<String, ArrayList<Book>> authorToBookNamesMap = new HashMap<>();

    public void addBook(Book book){
        int temp = 0;
        for (Map.Entry<String, ArrayList<Book>> authorBooks : authorToBookNamesMap.entrySet()){
            if (authorBooks.getKey().equals(book.getAuthorBook())){
                authorBooks.getValue().add(book);
                temp++;
            }
        }
        if (temp ==0 || authorToBookNamesMap.size() == 0){
            ArrayList<Book> books = new ArrayList<>();
            books.add(book);
            authorToBookNamesMap.put(book.getAuthorBook(), books);
        }
    }

    public boolean removeBook(Book book){
       try {
           authorToBookNamesMap.get(book.getAuthorBook()).remove(book);
           if (authorToBookNamesMap.get(book.getAuthorBook()).size() == 0) {
               authorToBookNamesMap.remove(book.getAuthorBook());
           }
           return true;
       }catch (NullPointerException e){
           return false;
       }
    }

    public Book findByBook(String bookName){
        for (Map.Entry<String, ArrayList<Book>> authorIsBooks : authorToBookNamesMap.entrySet()){
            ArrayList<Book> books = authorIsBooks.getValue();
            for (int i = 0; i < books.size(); i++){
               if(books.get(i).getNameBook().equals(bookName))
                   return books.get(i);
            }
        }
        return null;
    }

    public ArrayList<Book> findByAuthor(String auther){
        return authorToBookNamesMap.get(auther);
    }
}
