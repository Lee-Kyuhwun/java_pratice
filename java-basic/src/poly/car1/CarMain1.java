package poly.car1;


public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량선택
        K3Car   k3Car    = new K3Car();

        driver.setCar(k3Car);

        driver.drive();


        //차량 변겨
        Model3 model3Car = new Model3();
        driver.setCar(model3Car);
        driver.drive();
    }








}
