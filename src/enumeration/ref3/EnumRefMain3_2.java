package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;
        /*
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);
        */

        System.out.println("basic = " + Grade.BASIC.discount(price));
        System.out.println("gold = " + Grade.GOLD.discount(price));
        System.out.println("diamond = " + Grade.DIAMOND.discount(price));
    }
}
