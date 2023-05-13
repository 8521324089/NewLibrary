package com.Library;

import java.util.Date;

public class Register {
    Book b;
    Student s;
    Date d;

    public Register(Book b,Student s,Date d) {
        this.b = b;
        this.s = s;
        this.d = d;
        b.sum();
    }
    public Register(Book b,Student s,Date d,int a) {
        this.b = b;
        this.s = s;
        this.d = d;
        b.sub();
    }
    @Override
    public String toString() {
        return b.id+"\t"+b.getName()+"\t\t\t"+b.getAuthor()+"\t"+b.getQuantity()+"\t\t"+s.roll_no+"\t"+s.getName()+"\t"+s.getStd()+"\t"+d;
    }
}
