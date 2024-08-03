package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            print(grade);
        }

    }

    private static void print(AuthGrade grade) {
        System.out.println(grade.name()+" 등급의 level: "+ grade.getLevel() +", description: "+grade.getDescription());
    }
}
