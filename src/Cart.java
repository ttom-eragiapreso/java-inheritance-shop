import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! How many products would you like to add to your catalogue?");
        int catalogueLength = Integer.parseInt(scan.nextLine());
        Product[] catalogue = new Product[catalogueLength];
        System.out.println("Do you have our fidelity card? 1 - YES, 2 - NO");
        boolean hasCard = Integer.parseInt(scan.nextLine()) == 1;


        for (int i = 0; i < catalogue.length; i++) {
            System.out.println("What kind of product would you like to add?");
            System.out.println("1 - Smartphone | 2 - Tv | 3 - Headphones");

            int productToAdd = Integer.parseInt(scan.nextLine());

            switch (productToAdd){
                case 1 -> {
                    System.out.println("Please insert the following details for the Smartphone:");
                    System.out.print("Name:");
                    String name = scan.nextLine();
                    System.out.print("Price:");
                    BigDecimal price = new BigDecimal(scan.nextLine());
                    System.out.print("Storage:");
                    int storage = Integer.parseInt(scan.nextLine());
                    Smartphone smartphone = new Smartphone(name,price,storage);
                    if(storage < 32) smartphone.setFidelityDiscount(new BigDecimal("0.05"));
                    catalogue[i] = smartphone;
                }
                case 2 -> {
                    System.out.println("Please insert the following details for the Tv:");
                    System.out.print("Name:");
                    String name = scan.nextLine();
                    System.out.print("Price:");
                    BigDecimal price = new BigDecimal(scan.nextLine());
                    System.out.print("Inches:");
                    double inches = Double.parseDouble(scan.nextLine());
                    System.out.print("SmartTv?: 1 for YES, 2 for NO ");
                    boolean isSmart = Integer.parseInt(scan.nextLine()) == 1;
                    Tv tv = new Tv(name,price,inches,isSmart);
                    if(!isSmart) tv.setFidelityDiscount(new BigDecimal("0.1"));
                    catalogue[i] = tv;
                }
                case 3 -> {
                    System.out.println("Please insert the following details for the Headphones:");
                    System.out.print("Name:");
                    String name = scan.nextLine();
                    System.out.print("Price:");
                    BigDecimal price = new BigDecimal(scan.nextLine());
                    System.out.print("Colour:");
                    String colour = scan.nextLine();
                    System.out.print("Wireless?: 1 for YES, 2 for NO ");
                    boolean isWireless = Integer.parseInt(scan.nextLine()) == 1;
                    Headphones headphones = new Headphones(name,price,colour,isWireless);
                    if(!isWireless) headphones.setFidelityDiscount(new BigDecimal("0.07"));
                    catalogue[i] = headphones;
                }
                default -> {
                    System.out.println("Please insert a valid number");
                }
            }
        }
        BigDecimal totalPrice = new BigDecimal("00.00");
        for (Product product : catalogue) {
            if(hasCard){
                totalPrice = totalPrice.add(product.getDiscountedPrice());
            }else {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }

        System.out.println(totalPrice);

    }
}