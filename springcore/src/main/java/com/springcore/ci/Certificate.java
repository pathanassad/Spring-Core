package com.springcore.ci;

public class Certificate {
    private String name;

    public Certificate(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
