
package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author Cool
 */
public class EcommerceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        ElectronicProduct electronicProduct = new ElectronicProduct(1, "smartphone", 599.9, "Samsung", 1);

        
        ClothingProduct clothingProduct = new ClothingProduct(2, "T-shirt", 19.99, "Medium", "Cotton");

        
        BookProduct bookProduct = new BookProduct(3, "OOP", 39.99, "O’Reilly", "X Publications");

        
        System.out.print("Enter your customer ID: ");
        int customerId = Math.abs(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        
        Customer customer = new Customer(customerId, name, address);

        
       

        
        System.out.print("How many products do you want to order? ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 
         Cart cart = new Cart(customer.getCustomerId() ,numProducts );

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter product details for product " + (i + 1) + ":");
            
            System.out.print("Which product do you like to add? : 1- Smartphone, 2- Tshirt, 3- OOP");
            int productType = scanner.nextInt();

            Product product;
            switch (productType) {
                case 1:
                    product = electronicProduct;
                    break;
                case 2:
                    product = clothingProduct;
                    break;
                case 3:
                    product = bookProduct;
                    break;
                default:
                    System.out.println("Invalid product type.");
                    i--;
                    continue;
            }
            cart.addProduct(product);
            
        }

       
        System.out.println("your total is " + cart.calculatePrice() + "$");
        System.out.print("Do you want to place an order for the products in the cart? 1- yes 2- no) ");
        int placeOrder = scanner.nextInt();
        if (placeOrder == 1) {

            System.out.println("Order placed successfully.");
            System.out.println("Order details:");
            cart.placeOrder();           
        } else {
            System.out.println("Order not placed.");
        }

        scanner.close();
    }

    
}
