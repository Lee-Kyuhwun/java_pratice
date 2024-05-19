package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data a = new Data();
        a.value = 10;
        System.out.println("a = " + a.value);

        change(a);
        System.out.println("a = " + a.value);

    }

    static void change(Data a){
        a.value = 20;
    } 
}
