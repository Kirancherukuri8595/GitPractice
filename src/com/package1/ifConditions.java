package com.package1;

public class ifConditions {
    public static void main(String[] args) {
        int value = 1;

        if (value == 1){
            System.out.println("the value is equal to one");
        }

        else{
            System.out.println("the value is not equal to one");
        }

        if(value == 1){
            System.out.println("value is equal to one");
        }
        else if(value == 2){
            System.out.println("value is equal to two");
        }
        else if (value == 3){
            System.out.println("value is equal to three");
        }
        else{
            System.out.println("value is other than one or two or three");
        }
    }
}
