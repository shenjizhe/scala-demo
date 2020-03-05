package com.example.java;

// java 中的访问权限
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        a.clone();

    }
}
class A{
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return 1;
    }
}
