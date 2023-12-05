package com.Library;

public class Book {
    int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author,int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity=quantity;
    }

    public void sum() {
        this.quantity++;
    }
    public void sub() {
        this.quantity--;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printb(Book b){
        System.out.print("Id = "+b.id+",\tName = "+b.name+",\tAuthor = "+b.author+",\tQuantity = "+b.quantity);
    }

    @Override
    public String toString() {
        return ("Id = "+this.id+",\tName = "+this.name+",\tAuthor = "+this.author+",\tQuantity = "+this.quantity);
    }

}
