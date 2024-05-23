package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        String deco = new DecoUtil1().deco(s);
        System.out.println("deco = " + deco);
        System.out.println("s = " + s);
    }
}
