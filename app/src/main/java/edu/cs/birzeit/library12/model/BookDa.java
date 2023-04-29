package edu.cs.birzeit.library12.model;

import java.util.ArrayList;
import java.util.List;

public class BookDa {
    private ArrayList<Book> books;

    public BookDa(){
        books = new ArrayList<>();
        books.add(new Book("Java in a nutshell", "Programming",
                300));
        books.add(new Book("Professional C#", "Programming",
                350));
        books.add(new Book("Beginning MySql", "Database",
                300));
        books.add(new Book("The Art of software Trstingf", "Testing",
                400));


    }
    public List<Book> getBooksByType(String type){
        List<Book> result = new ArrayList<Book>();
        for(Book b : books){
            if(b.getType().equals(type)){
                result.add(b);
            }
        }
        return result;


    }
    public String[] getBookTypes(){
        String[] types = {"Programming", "Database", "Testing"};
        return types;
        //TODO: ...to remove....add.....
    }

}
