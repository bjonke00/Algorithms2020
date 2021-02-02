package com.algorithmpractice.javapractice.designpattern;

public class Singleton {
    private Singleton singleton;

    private Singleton(){}

    public Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

    synchronized public Singleton getThreadSafeInstance(){
        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }
}
