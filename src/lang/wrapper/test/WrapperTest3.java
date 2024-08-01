package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integerObj = Integer.valueOf(str);
        System.out.println("integerObj = " + integerObj);
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        Integer integerObj2 = Integer.valueOf(intValue);
        System.out.println("integerObj2 = " + integerObj2);
    }
}
