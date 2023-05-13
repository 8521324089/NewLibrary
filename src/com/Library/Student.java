package com.Library;

public class Student {
    int roll_no;
    private int std;
    private String name;

    public Student(int roll_no, int std, String name) {
        this.roll_no = roll_no;
        this.std = std;
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public String getName() {
        return name;
    }

    public  static void print(Student s){
        System.out.print("Roll_no = "+s.roll_no+",\tName = "+s.name+",\tStd = "+s.std);
    }

    @Override
    public String toString() {
        return("Roll_no = "+this.roll_no+",\tName = "+this.name+",\tStd = "+this.std);
    }

}
