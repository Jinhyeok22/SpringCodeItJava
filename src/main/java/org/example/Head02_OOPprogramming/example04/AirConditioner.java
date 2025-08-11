package org.example.Head02_OOPprogramming.example04;

public class AirConditioner {

    private String brand;
    private boolean powerOn;
    private int temperature;


    public AirConditioner(String brand, int temperature) {
        this.brand = brand;
        this.temperature = temperature;
        this.powerOn = false;
    }

    public void powerOn() {
        powerOn = true;
        System.out.println(brand + " 에어컨 전원을 킵니다.");
    }

    public void powerOff() {
        powerOn = false;
        System.out.println(brand + " 에어컨 전원을 끕니다.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(brand + " 에어컨 온도를 " + temperature + "도로 설정했습니다.");
    }


    @Override
    public String toString() {
        return "에어컨 브랜드=" + brand +
                ", 전원=" + (powerOn ? "켜짐" : "꺼짐") +
                ", 온도=" + temperature ;
    }
}





