package lang.string.immutable;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world";
        System.out.println("Java 포함되어 있는지: "+ str.contains("Java"));
        System.out.println("Java의 첫번째 인덱스: "+ str.indexOf("Java"));
        System.out.println("인덱스 10 이후 Java의 첫번째 인덱스: "+ str.indexOf("Java", 10));
        System.out.println("Java 마지막 인덱스: "+ str.lastIndexOf("Java"));
    }
}
