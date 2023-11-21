import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InvoiceGenerator {

    public static void main(String[] args) {

        // Ask user for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item_id: ");
        String item_id = scanner.next();
        System.out.println("Enter the item_name: ");
        String item_name = scanner.next();
        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter the unit_price: ");
        double unit_price = scanner.nextDouble();

        try {
            // Initialize HTML file
            FileWriter fileWriter = new FileWriter("Invoice.html");
            fileWriter.write("<html><head><title>Invoice</title></head><body>");

            // Set up the title and headers
            fileWriter.write("<h1>Invoice</h1>");

            // Add a table to the HTML
            fileWriter.write("<table>");
            fileWriter.write("<tr><th>Item ID</th><th>Item Name</th><th>Quantity</th><th>Unit Price</th></tr>");

            // Add data to the table
            fileWriter.write("<tr>");
            fileWriter.write("<td>" + item_id + "</td>");
            fileWriter.write("<td>" + item_name + "</td>");
            fileWriter.write("<td>" + quantity + "</td>");
            fileWriter.write("<td>" + unit_price + "</td>");
            fileWriter.write("</tr>");

            // Close the table and calculate the total price
            fileWriter.write("</table>");
            double totalPrice = quantity * unit_price;

            // Display the total price
            fileWriter.write("<p>Total Price: $" + totalPrice + "</p>");

            // Close the HTML file
            fileWriter.write("</body></html>");
            fileWriter.close();

            System.out.println("Invoice.html has been generated.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}