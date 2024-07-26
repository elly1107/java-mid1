package lang.immutable.address;

public class Address {
    private String value;

    //생성자: 인스턴스 생성할 때 : Address("d")
    public Address(String value) {
        this.value = value;
    }


    //getter 현재 value 값 return
    public String getValue() {
        return value;
    }


    //setter 현재 value 값 set하는 함수
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
