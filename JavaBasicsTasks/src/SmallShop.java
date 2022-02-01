import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double pricePerProduct = 0;

        switch (city) {
            case "Sofia":

                if ("coffee".equals(product)) {
                    pricePerProduct = 0.50;
                } else if ("water".equals(product)) {
                    pricePerProduct = 0.80;
                } else if ("beer".equals(product)) {
                    pricePerProduct = 1.20;
                } else if ("sweets".equals(product)) {
                    pricePerProduct = 1.45;
                } else if ("peanuts".equals(product)) {
                    pricePerProduct = 1.60;
                }
                break;

            case "Plovdiv":

                if(product.equals("coffee")) {
                    pricePerProduct = 0.40;
                } else if (product.equals("water")) {
                    pricePerProduct = 0.70;
                } else if (product.equals("beer")){
                    pricePerProduct = 1.15;
                } else if (product.equals("sweets")) {
                    pricePerProduct = 1.30;
                } else if(product.equals("peanuts")) {
                    pricePerProduct = 1.50;
                }
                break;

            case "Varna":

                if(product.equals("coffee")) {
                    pricePerProduct = 0.45;
                } else if (product.equals("water")) {
                    pricePerProduct = 0.70;
                } else if (product.equals("beer")){
                    pricePerProduct = 1.10;
                } else if (product.equals("sweets")) {
                    pricePerProduct = 1.35;
                } else if(product.equals("peanuts")) {
                    pricePerProduct = 1.55;
                }
                break;
        }

        double totalSum = quantity * pricePerProduct;
        System.out.println(totalSum);
    }
}
