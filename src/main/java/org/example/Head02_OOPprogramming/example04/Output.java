package org.example.Head02_OOPprogramming.example04;

public class Output {
    public static void main(String[] args) {

        AirConditioner ac1 = new AirConditioner("삼성", 24);
        AirConditioner ac2 = new AirConditioner("LG", 26);
        AirConditioner ac3 = new AirConditioner("캐리어", 22);


        ac1.powerOn();
        ac1.setTemperature(18);
        ac1.powerOff();
        ac2.powerOn();
        ac2.setTemperature(24);
        ac2.powerOff();
        ac3.powerOn();
        ac3.setTemperature(28);
        ac3.powerOff();

        System.out.println(ac1);
        System.out.println(ac2);
        System.out.println(ac3);
    }
}
