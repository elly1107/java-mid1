package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.callThrow();
        } catch (MyUncheckedException e) {
            System.out.println("오류메세지: "+e.getMessage());
        }
        System.out.println("정상 종료");
    }
}
