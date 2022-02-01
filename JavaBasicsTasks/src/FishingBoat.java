import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());

        double priceOfRenting = 0;

        switch (season) {
            case "Spring":
                priceOfRenting = 3000;
                if (numberOfFishermen <= 6) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.10);
                } else if (numberOfFishermen > 7 && numberOfFishermen <= 11) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.15);
                } else if (numberOfFishermen > 12) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.25);
                }
                break;
            case "Summer":
            case "Autumn":
                priceOfRenting = 4200;
                if (numberOfFishermen <= 6) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.10);
                } else if (numberOfFishermen > 7 && numberOfFishermen <= 11) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.15);
                } else if (numberOfFishermen > 12) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.25);
                }
                break;
            case "Winter":
                priceOfRenting = 2600;
                if (numberOfFishermen <= 6) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.10);
                } else if (numberOfFishermen > 7 && numberOfFishermen <= 11) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.15);
                } else if (numberOfFishermen > 12) {
                    priceOfRenting = priceOfRenting - (priceOfRenting * 0.25);
                }
                break;
        }

        if (numberOfFishermen % 2 == 0 && season.equals("Spring")
                || season.equals("Summer") || season.equals("Winter")) {
            priceOfRenting = priceOfRenting - (priceOfRenting * 0.05);
        }

        double diff = Math.abs(budget - priceOfRenting);
        if (budget >= priceOfRenting) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf ("Not enough money! You need %.2f leva.", diff);
        }
    }
}
