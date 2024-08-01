package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        //String -> Integer 는 오토가 안됨!!
        Integer integerObj = Integer.valueOf(str);
        System.out.println("integerObj = " + integerObj);

        int intValue = integerObj;
        System.out.println("intValue = " + intValue);
        Integer integerObj2 = intValue;
        System.out.println("integerObj2 = " + integerObj2);
    }
}
