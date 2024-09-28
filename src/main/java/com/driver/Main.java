package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        //Vehicle c = new Vehicle("c");
       // c.steer(10);
       // c.move(20,40);
       // c.stop();
       // Car c1 = new Car("benz",2,4,1,false,"benztype",4);
      //  c1.changeGear(2);
        //c1.changeSpeed(100,1);


        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}