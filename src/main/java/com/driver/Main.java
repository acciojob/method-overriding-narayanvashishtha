package com.driver;


public class Main {
    static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
     static class B extends A{
        public String meth(){
            return "Method is overriden in Extended class B";
        }
    }
    public static void main(String[] args) {
        A obj = new B();
        obj.meth();
    }
}