package com.springcore.autowire;

public class Result {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Result{" +
                "marks=" + marks +
                '}';
    }



}
