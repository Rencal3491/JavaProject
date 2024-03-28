package javaEx_F;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz {
    public static void main(String[] args) {
        
        List<User> people = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴를 입력하세요.");
            System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
            System.out.print(">>> ");
            int menu = scan.nextInt();

            if (menu == 1) {
                System.out.print("이름: ");
                String name = scan.next();
                System.out.print("나이: ");
                int age = scan.nextInt();

                User user = new User(name, age);
                people.add(user);
            } else if (menu == 2) {
                System.out.println("====== 모든 회원 정보 ======");
                for (User p : people) {
                    System.out.println(p);
                }
                System.out.println("==========================");
            } else if (menu == 3) {
                System.out.println("찾을 이름을 입력하세요.");
                System.out.print(">>> ");
                String name = scan.next();

                boolean found = false;
                for (User p : people) {
                    if (p.getName().equals(name)) {
                        System.out.println("이름: " + p.getName() + ", 나이: " + p.getAge());
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(name + "님은 목록에 없습니다.");
                }
            } else if (menu == 4) {
                System.out.print("삭제할 이름을 입력하세요: ");
                String name = scan.next();

                boolean found = false;
                for (User p : people) {
                    if (p.getName().equals(name)) {
                        people.remove(p);
                        found = true;
                        System.out.println(name + "님의 정보가 삭제되었습니다.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println(name + "님은 목록에 없습니다.");
                }
            } else if (menu == 5) {
                scan.close();
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}