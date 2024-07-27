package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;


        System.out.println(a);
        System.out.println(b);

        //b.setValue("부산"); ImmutableAddress는 setvalue가 없음. 새로 생성해야함
        b = new ImmutableAddress("부산");
        System.out.println("b-> 부산");
        System.out.println(a); //부산으로 뜨는 이유는, b에 a가 가리키는 객체의 참조값이 복사되어있기 대문.
        System.out.println(b);
    }
}
