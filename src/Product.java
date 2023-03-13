import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    //Data
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private static final BigDecimal VAT = new BigDecimal("0.22");

    //Constructor
    public Product(String name, BigDecimal price){
        Random rnd = new Random();
        code = rnd.nextInt();
        this.name = name;
        this.price = price;
    }
    //getters & setters
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static BigDecimal getVAT() {
        return VAT;
    }

    //Custom methods
    public BigDecimal getPriceWithVAT(){
        BigDecimal VATPercentage = price.multiply(VAT);
        return price.add(VATPercentage).setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price ;
    }
    public BigDecimal getDiscountedPrice(){
        BigDecimal discountPercentage = price.multiply(new BigDecimal("0.02"));
        return price.subtract(discountPercentage);
    }
}
