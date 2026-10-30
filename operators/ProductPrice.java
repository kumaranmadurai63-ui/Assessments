package operators;

public class ProductPrice {
    public static void main(String[] args) {
        double price = 999.50;
        int quantity = 3;

        double totalPrice = price * quantity;

        double discount = totalPrice * 10 / 100;

        totalPrice -= discount;

        System.out.println("Product Price = ₹" + price);
        System.out.println("Quantity = " + quantity);
        System.out.println("Discount = ₹" + discount);
        System.out.println("Final Price = ₹" + totalPrice);
    }
}