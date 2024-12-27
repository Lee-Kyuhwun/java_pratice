package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정함 : "+ car);
        this.car = car;
    }

    public void drive(){
        System.out.println("운전을 시작합니다.");

        if(car != null){
            car.startEngine();
            car.pressAccelerator();
            car.offEngine();
        }
    }

}
