package com.algorithmpractice.javapractice.basics;

public class EnumsPractice {

    enum Day{
        MONDAY, TUESDAY, WEDNESDAY
    }

    enum Transportation{
        CAR(120), BICYCLE(30), SKATE_BOARD(15);
        int maxSpeed;

        Transportation(int maxSpeed){
            this.maxSpeed = maxSpeed;
        }
    }
    public static void main(String[] args) {
        Day monday = Day.MONDAY;

        for(Day day : Day.values()){
            System.out.println(day);
        }

        int currentMaxSpeed = Transportation.BICYCLE.maxSpeed;
        System.out.println(currentMaxSpeed);

        for(Transportation transportation : Transportation.values()){
            System.out.println(String.format("%s %s %s",transportation.ordinal(), transportation.name(), transportation.maxSpeed));
        }

    }
}
