package ex1_objstream;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();    

        System.out.println("1. 새로운등록");
        System.out.println("2. 불러오기");
        System.out.println(">>");

        int sel = sc.nextInt();
        switch (sel) {
            case 1://유저등록
                System.out.println("이름: ");
                user.setName(sc.next());
                System.out.println("나이: ");
                user.setAge(sc.nextInt());

                System.out.println("전화: ");
                user.setTel(sc.next());
                
                new UserWriter().writeInfo(user);
                break;
            case 2://불러오기
                System.out.println("전화: ");
                String tel = sc.next();

                UserLoader ul = new UserLoader();
                user = ul.loadInfo(tel);

                System.out.println("이름:" + user.getName());
                System.out.println("나이"+ user.getAge());
                System.out.println("전화"+ user.getTel());
                break;
            default:
                break;
        }
    }
}
