import java.math.BigDecimal;

public class Cart {
    public static void main(String[] args) {

        Product prodotto = new Product("Test", new BigDecimal("10.00"));

        System.out.println(prodotto.getPriceWithVAT());

        Smartphone iphone = new Smartphone("Iphone 10", new BigDecimal("789.99"),128);

        System.out.println(iphone);

        Tv samsung = new Tv("SmartWow", new BigDecimal("350.99"), 45.5, true);

        System.out.println(samsung);
    }
}