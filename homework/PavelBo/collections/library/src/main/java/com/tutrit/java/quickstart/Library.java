package com.tutrit.java.quickstart;

import java.util.*;

public class Library {

    public Map<String, ArrayList<String>> collectionBooks = new HashMap<>();

    public void addBook(Book book){
        int temp = 0;
        for (Map.Entry<String, ArrayList<String>> authorIsBooks : collectionBooks.entrySet()){
            if (authorIsBooks.getKey().equals(book.getAuthorBook())){
                authorIsBooks.getValue().add(book.getNameBook());
                temp++;
            }
        }
        if (temp ==0 || collectionBooks.size() == 0){
            ArrayList<String > books = new ArrayList<>();
            books.add(book.getNameBook());
            collectionBooks.put(book.getAuthorBook(), books);
        }
    }

    public void removeBook(Book book){
        int temp = 0;
        for (Map.Entry<String, ArrayList<String>> authorIsBooks : collectionBooks.entrySet()){
            if (authorIsBooks.getKey().equals(book.getAuthorBook())){
                authorIsBooks.getValue().remove(book.getNameBook());
                if (authorIsBooks.getValue().size() == 0) {
                    collectionBooks.remove(authorIsBooks.getKey());
                    break;
                }
            }
        }
    }

    public Book findByBook(String bookName){
        for (Map.Entry<String, ArrayList<String>> authorIsBooks : collectionBooks.entrySet()){
            ArrayList<String> books = authorIsBooks.getValue();
            for (int i = 0; i < books.size(); i++){
               if(books.get(i).equals(bookName))
                   return new Book(authorIsBooks.getKey(), books.get(i));
            }
        }
        return null;
    }

    public ArrayList<String> findByAuthor(String auther){
        return collectionBooks.get(auther);
    }
}
