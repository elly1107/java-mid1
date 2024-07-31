package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        //박싱
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128~`127 자주 사용하는 값 재사용, 불변
        Integer integerObj2 = Integer.valueOf(10); //미리 만들어둔 것을 이용하기 때문에 참조값이 위와 같음.
        Long longObj = Long.valueOf(200);
        Double doubleObj = Double.valueOf(20.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);


        //언박싱
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue=longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: "+(newInteger == integerObj));
        System.out.println("==: "+(integerObj2 == integerObj));
        System.out.println("equals: "+(newInteger.equals(integerObj)));
    }

}
