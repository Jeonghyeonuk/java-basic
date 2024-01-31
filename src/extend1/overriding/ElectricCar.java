package extend1.overriding;

public class ElectricCar extends Car {

    public void charge() {
        System.out.println("차를 충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("전기차를 더 빠르게 이동합니다.");
    }
}
