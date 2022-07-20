package com.company.inheritance;

public class Male extends Human {

    public void shaving() {
        System.out.println("Male category is doing shaving");
    }

    public void addition(){
        System.out.println(30.23+20.56);
    }

    public static void main(String[] args) {
        Male m = new Male();
        m.eating();
        m.walk();
        m.sleep();
        m.speaking();
        m.shaving();
    }

}
