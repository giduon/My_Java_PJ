package ch07_collection.crudmember;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();

        dao.insertData(new Member("kim", "김민식", 10, "남"));
        dao.insertData(new Member("park", "박지선", 20, "여"));
        dao.insertData(new Member("lee", "이현우", 30, "남"));
        dao.insertData(new Member("choi", "최문호", 50, "여"));

        int size = dao.getSize();
        System.out.println("회원은 총 " + size + "명 입니다.");

        System.out.println("모든 회원 정보를 출력합니다.");
        List<Member> memberList = dao.selectAll();
        for (Member bean:memberList){
            System.out.println(bean);
        }

    }
}
