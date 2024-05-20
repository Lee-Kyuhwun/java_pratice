package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {

        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "홍길동";
        memberInit1.grade = 1;
        memberInit1.age = 20;

        MemberInit memberInit2 = new MemberInit();
        memberInit2.name = "홍길동";
        memberInit2.grade = 1;
        memberInit2.age = 20;

        MemberInit[] members = {memberInit1, memberInit2};
        for(MemberInit s : members){
            System.out.println("s = " + s);
        }

    }
}
