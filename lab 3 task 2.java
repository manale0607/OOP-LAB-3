import java.util.Scanner;
public class mobile {
        String brand;
        String model;
        double price;

        mobile() {
            brand = "Unknown";
            model = "Not Specified";
            price = 0.0;
        }

        mobile(String b, String m, double p) {
            brand = b;
            model = m;
            price = p;
        }

        // Method to display details
        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("----------------------");
        }
    }

    public void main(String[] args) {

            mobile m1 = new mobile();

            mobile m2 = new mobile("Samsung", "Galaxy S23", 250000);

            m1.display();
            m2.display();
        }

