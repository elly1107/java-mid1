package enumeration.test;

public class MenuService {
    public void printMenu(AuthGrade authGrade) {
        System.out.println("당신의 등급은 "+ authGrade.getDescription()+"입니다.");
        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() == 1) {
            System.out.println("- 메인 화면");
        } else if (authGrade.getLevel() == 2) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (authGrade.getLevel() == 3) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }
}
