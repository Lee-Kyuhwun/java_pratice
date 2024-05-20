package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {

        MemberInit memberInit1 = getMemberInit();

        MemberInit memberInit2 = getMemberInit();

        MemberInit[] members = {memberInit1, memberInit2};
        for(MemberInit s : members){
            System.out.println("s = " + s);
        }

    }

    private static MemberInit getMemberInit() {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "홍길동";
        memberInit1.grade = 1;
        memberInit1.age = 20;
        return memberInit1;
    }
}
