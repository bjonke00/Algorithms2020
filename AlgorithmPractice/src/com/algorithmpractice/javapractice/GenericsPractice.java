package com.algorithmpractice.javapractice;

import java.util.HashMap;
import java.util.Map;

public class GenericsPractice {

    //You can pass in a Generic that extends a class.
    public static class MyNumber <T extends Number> {
        private T number;

        public MyNumber(T number){
            this.number = number;
        }

        public double findSquare(){
            return number.doubleValue() * number.doubleValue();
        }

        public double findSquare(MyNumber<?> number){
            return number.findSquare();
        }
    }

    //You can pass in two Generics to a class. Think of a Map<Integer, String>
    public static class MyNumber2 <K, V>{
        private Map<K, V> map = new HashMap();

        public MyNumber2(K k, V v){
            map.put(k, v );
        }
    }

    public static void main(String[] args) {
        MyNumber<Integer> myInteger = new MyNumber(1);
        MyNumber<Double> myDouble = new MyNumber(1.0);

        System.out.println(myInteger.findSquare());
        System.out.println(myDouble.findSquare());

        //How can we pass in a Double when myInteger is an Integer?
        //Use a wild card <?>. The wild card tells us this can be any type within bounds of T extends Number.
        System.out.println(myInteger.findSquare(new MyNumber<Double>(15.0)));
    }
}
