package day9;

interface SmartAppliance {

    void turnOn();
    void turnOff();

    default void selfControl() {
        System.out.println("시스템 상태를 점검합니다... 모든 장치가 정상입니다.");
    }
}

interface SmartAppliance2 {
    default void selfControl() {
        System.out.println("시스템 상태를 점검합니다... 모든 장치가 정상입니다.2");
    }
}

class AirConditioner implements SmartAppliance {
    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다. 시원한 바람이 나옵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다.");
    }    
}

class WashingMachine implements SmartAppliance, SmartAppliance2 {
    @Override
    public void turnOn() {
        System.out.println("세탁기를 작동합니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("세탁이 종료되었습니다.");
    }
    @Override
    public void selfControl() {
        System.out.println("세탁조 오염도를 체크합니다... 청소가 필요합니다!");
    }
}

public class InterfaceTest4 {
    public static void main(String[] args) {
        SmartAppliance ac = new AirConditioner();
        ac.turnOn();
        ac.selfControl(); // 인터페이스의 기본 메서드 실행

        System.out.println("--------------------");

        SmartAppliance wm = new WashingMachine();
        wm.turnOn();
        wm.selfControl(); // 재정의된 메서드 실행
        
        SmartAppliance2 wm2 = new WashingMachine();
        ((SmartAppliance)wm2).turnOn();
        wm2.selfControl(); // 재정의된 메서드 실행
        
        Object wm3 = new WashingMachine();
        ((SmartAppliance)wm3).turnOn();
        ((SmartAppliance)wm3).selfControl(); // 재정의된 메서드 실행
        ((SmartAppliance2)wm3).selfControl(); // 재정의된 메서드 실행
        ((WashingMachine)wm3).selfControl(); // 재정의된 메서드 실행
    }
}
