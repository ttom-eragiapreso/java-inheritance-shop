import java.math.BigDecimal;

public class Tv extends Product{
    //Data
    private double inches;
    private boolean isSmart;
    //Constructor
    public Tv(String name, BigDecimal price, double inches, boolean isSmart) {
        super(name, price);
        this.inches = inches;
        this.isSmart = isSmart;
    }
    //Getters and Setters
    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "Tv{" +
                "inches=" + inches +
                ", isSmart=" + isSmart +
                '}';
    }
}
