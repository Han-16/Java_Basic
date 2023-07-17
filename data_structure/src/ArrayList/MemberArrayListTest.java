package ArrayList;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberA = new Member(1001, "A");
        Member memberB = new Member(1002, "B");
        Member memberC = new Member(1003, "C");
        Member memberD = new Member(1004, "D");

        memberArrayList.addMember(memberA);
        memberArrayList.addMember(memberB);
        memberArrayList.addMember(memberC);
        memberArrayList.addMember(memberD);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberD.getMemberId());
        memberArrayList.showAllMember();
    }
}

