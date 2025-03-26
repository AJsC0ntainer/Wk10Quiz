//Import scanner library.
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Creates a scanner object.
        Scanner input = new Scanner(System.in);
        //Program Title.
        System.out.println("Price Calculator");
        //Prompts the user input for price.
        System.out.print("Enter Price: ");
        //Declares and stores the value of the price from user input.
        double price = input.nextDouble();
        //Prompts the user for the tax value.
        System.out.print("Enter Tax: (0.825 for texas.): ");
        //Declares and stores he vlaue of the Tax from user input.
        double tax = input.nextDouble();
        System.out.print("Enter Discount: (0.05% for 5%): ");
        //Declares and stores he value of the discount from user input.
        double discount = input.nextDouble();

        double discountedPrice = price - (price * discount);
        double cost = (discountedPrice / tax);

        //double discountedPrice = (cost * discount) - price;

        

        System.out.println(discountedPrice);
        //System.out.println(discountedPrice);

        input.close();





    }

}