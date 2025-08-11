package ch07_collection.crudmember;

import ch07_collection.crudmember.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private List<Member> memberList = null;

    public MemberDao() {
        this.memberList = new ArrayList<Member>();
    }

    public int insertData(Member member){ // 회원 1명 추가하기
        System.out.println("아이디가 " + member.getId() + " 인 회원이 가입합니다.");
        this.memberList.add(member);
        return 1;
    }

    public int getSize() {
        return memberList.size();
    }

    public List<Member> selectAll() {
        return this.memberList;
    }
}
