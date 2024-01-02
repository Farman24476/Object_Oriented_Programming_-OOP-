import java.util.Scanner;

public class Furniture{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose P for pine, O for oak, or M for mahogany:");
        String choice = input.nextLine();

        double price;

        if (choice.equalsIgnoreCase("P")) {
            price = 100;
        } else if (choice.equalsIgnoreCase("O")) {
            price = 225;
        } else if (choice.equalsIgnoreCase("M")) {
            price = 310;
        } else {
            System.out.println("Invalid.");
            return;
        }

        System.out.println("Price of the table is RM " + price);
    }
}
