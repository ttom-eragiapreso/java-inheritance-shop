import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    //Data
    private int IMEI;
    private String storage;
    //Constructor
    public Smartphone(String name, BigDecimal price, String storage){
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

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone{" +
                "IMEI=" + IMEI +
                ", storage='" + storage + '\'' +
                '}';
    }
}
