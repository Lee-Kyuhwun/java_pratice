package poly.car1;

public class Model3 implements Car{

    @Override
    public void startEngine() {
        System.out.println("Model3 시동을 켭니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3 악셀을 밟습니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3 시동을 끕니다.");
    }
}
