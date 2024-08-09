package nested.nested;

public class NestedOuter {
    //클래스 멤버
    private static int outClassValue = 3;
    static int ClassValue = 2;

    //인스턴스 멤버
    private int outInstanceValue=2;

    //메서드
    static class Nested{
        private int nestedInstanceValue=1;
        public void print(){
            //자신의 멤버 변수
            System.out.println(nestedInstanceValue);

            //바깥 클래스 인스턴스 멤버 변수 접근 불가
            //System.out.println(outInstanceValue);

            //바깥 클래스 클래스 멤버 변수 접근 가능, private도 가능
            System.out.println(outClassValue);

        }
    }
}
