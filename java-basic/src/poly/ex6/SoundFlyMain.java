package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Dog dog = new Dog();
        Bird bird = new Bird();
        chicken.sound();
        bird.sound();
        dog.sound();

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    //AbstriactAnimal 사용가능
    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    //Flay 인터페이스가 있으면 사용가능
    private static void flyAnimal(Fly fly){
        fly.fly();
    }

}
