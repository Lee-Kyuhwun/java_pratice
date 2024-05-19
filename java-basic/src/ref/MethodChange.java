package ref;

public class MethodChange {

    public static void main(String[] args) {

        int a= 10;
        System.out.println("a = " + a);

        change(a);
        System.out.println("a = " + a);

    }

    static void change(int a){
        a = 20;
    }
}
