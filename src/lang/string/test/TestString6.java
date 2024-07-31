package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java hello spring hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);

        //indexOf는 못찾으면 -1을 반환한다
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            System.out.println("index in while= " + index);
            count+=1;
        }
        System.out.println("count = " + count);
    }
}
