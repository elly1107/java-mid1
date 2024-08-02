package enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(ClassGrade.BASIC)) {
            discountPercent=10;
        } else if (grade.equals(ClassGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(ClassGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade+": 할인 x");
        }

        return price * discountPercent / 100;
    }
}
