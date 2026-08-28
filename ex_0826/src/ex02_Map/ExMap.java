package ex02_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class ExMap {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap<>();
        map.put("kim", 1111);
        map.put("lee", 2222);

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        String id = sc.next();
        System.out.print("PW: ");
        int pw = sc.nextInt();

        if(map.containsKey(id)){
            if(pw == map.get(id))
                System.out.println("로그인성공");
            else
                System.out.println("비밀번호 불일치");
        }
        else
            System.out.println("아이디가 틀렸습니다.");

    }
}
