package com.algorithmpractice.javapractice;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalPractice {
    public class HelloWorldOptionals {
        private Optional<String> hello = Optional.ofNullable(null);

        public void setHello(String hello) {
            this.hello = Optional.ofNullable(hello);
        }

        public String getHello() {
            return hello
                    .map(String::toUpperCase)
                    .orElse("HELLO");
        }
    }
    @Test
    public void testHelloWorldOptionals() {
        HelloWorldOptionals helloWorldOptionals = new HelloWorldOptionals();
        System.out.println(helloWorldOptionals.getHello());
        helloWorldOptionals.setHello("world");
        System.out.println(helloWorldOptionals.getHello());
    }
}

