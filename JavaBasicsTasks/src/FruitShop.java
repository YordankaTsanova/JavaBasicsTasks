import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double singlePrice = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

                if (fruit.equals("banana")) {
                    singlePrice = 2.50;
                } else if (fruit.equals("apple")) {
                    singlePrice = 1.20;
                } else if (fruit.equals("orange")) {
                    singlePrice = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    singlePrice = 1.45;
                } else if (fruit.equals("kiwi")) {
                    singlePrice = 2.70;
                } else if (fruit.equals("pineapple")) {
                    singlePrice = 5.50;
                } else if (fruit.equals("grapes")) {
                    singlePrice = 3.85;
                } else {
                    System.out.println("error");
                }
                break;

            case "Saturday":
            case "Sunday":

                if (fruit.equals("banana")) {
                    singlePrice = 2.70;
                } else if (fruit.equals("apple")) {
                    singlePrice = 1.25;
                } else if (fruit.equals("orange")) {
                    singlePrice = 0.90;
                } else if (fruit.equals("grapefruit")) {
                    singlePrice = 1.60;
                } else if (fruit.equals("kiwi")) {
                    singlePrice = 3.00;
                } else if (fruit.equals("pineapple")) {
                    singlePrice = 5.60;
                } else if (fruit.equals("grapes")) {
                    singlePrice = 4.20;
                } else {
                    System.out.println("error");
                }
                break;

            default:
                System.out.println("error");
                break;
        }

        if (singlePrice == 0) {
            System.out.println();
        } else {
            double price = quantity * singlePrice;
            System.out.printf("%.2f%n", price);
        }

    }
}
