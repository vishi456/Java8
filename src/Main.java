package com.lambda;
interface I{
    void call();
    default void message()
    {
        System.out.println("sent");
    }
}
class Androidphone implements I{
    public void call()
    {
        System.out.println("Calling");
    }
}
public class Main{
    public static void main(String[] args) {
        I p=new Androidphone();
        p.call();
        p.message();
    }
}