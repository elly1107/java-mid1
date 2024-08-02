package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade.equals(BASIC)) {
            discountPercent=10;
        } else if (classGrade.equals(GOLD)) {
            discountPercent = 20;
        } else if (classGrade.equals(DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(classGrade+": 할인 x");
        }

        return price * discountPercent / 100;
    }
}
