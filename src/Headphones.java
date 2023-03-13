import java.math.BigDecimal;

public class Headphones extends Product {
    private String colour;
    private boolean isWireless;

    public Headphones(String name, BigDecimal price, String colour, boolean isWireless) {
        super(name, price);
        this.colour = colour;
        this.isWireless = isWireless;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return  "Headphones - " +
                "colour='" + colour + '\'' +
                ", isWireless=" + isWireless +
                super.toString()
                ;
    }
}
