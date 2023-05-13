package com.Library;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        Book b1=new Book(1,"Ncert","NS",5);
        Book b2=new Book(2,"Rs_Aggarwal","RS",4);
        Book b3=new Book(3,"Rd Sharma","RD",2);

        Student s1=new Student(100,10,"VIVEK");
        Student s2=new Student(101,10,"SUMIT");
        Student s3=new Student(102,10,"YASH");
        Student s4=new Student(103,10,"ABHISHEK");

        Date d1=new Date();
        Date d2=new Date();
        Date d3=new Date();
        Date d4=new Date();

        HashSet<Register> lib=new HashSet<>();
        Register r1=new Register(b1,s1,d1);
        Register r2=new Register(b1,s2,d1);
        Register r3=new Register(b2,s3,d2);
        Register r4=new Register(b3,s4,d2);
        Register r5=new Register(b1,s3,d3);
        Register r6=new Register(b1,s1,d4,0);
        lib.add(r1);
        lib.add(r2);
        lib.add(r3);
        lib.add(r4);
        lib.add(r5);
        lib.add(r6);
        System.out.println("ID\tBook\t\t\tAuthor\tQuantity\tName\tRoll_no\tSTD\tDate");
        Iterator<Register> i=lib.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
