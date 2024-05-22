package access.a;

public class AccessIneerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicField =1;
        accessData.publicMethod();

        // 같은 패키지 default 접근 가능
        accessData.defaultField = 1;
        accessData.defaultMethod();

        // private 접근 불가
        // accessData.privateField = 1;
        // accessData.privateMethod();

        accessData.innerAccess();
    }
}
