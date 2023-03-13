import java.math.BigDecimal;

public class Cart {
    public static void main(String[] args) {

        Product prodotto = new Product("Test", new BigDecimal("10.00"));

        System.out.println(prodotto.priceWithVAT());

        Smartphone iphone = new Smartphone("Iphone 10", new BigDecimal("789.99"),"128GB");

        System.out.println(iphone);
    }
}