package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    //생성자: 인스턴스 생성할 때 : Address("d")
    public ImmutableAddress(String value) {
        this.value = value;
    }

    //getter 현재 value 값 return
    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
