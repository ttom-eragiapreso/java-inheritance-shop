import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    //Data
    private int IMEI;
    private int storage;
    //Constructor
    public Smartphone(String name, BigDecimal price, int storage){
        super(name, price);
        Random rnd = new Random();
        IMEI = rnd.nextInt(1, 99999999);
        this.storage = storage;
    }
    //Getters & Setters
    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return  "Smartphone - " +
                "IMEI=" + IMEI +
                ", storage='" + storage + '\'' +
                super.toString()
                ;
    }

    @Override
    public BigDecimal getDiscountedPrice() {
        if (storage < 32) {
            BigDecimal discountPercentage = getPrice().multiply(new BigDecimal("0.05"));
            return getPrice().subtract(discountPercentage);
        }
        return super.getDiscountedPrice() ;
    }
}
