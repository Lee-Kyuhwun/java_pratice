package ex6;

public class Dog extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void fly() {
        System.out.println("Dog is flying");
    }
}
