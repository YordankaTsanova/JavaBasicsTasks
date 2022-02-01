import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentForTheHall = Integer.parseInt(scanner.nextLine());

        double cakePrice = rentForTheHall * 0.20;
        double drinksPrice = cakePrice - (cakePrice * 0.45);
        double animatorPrice = rentForTheHall / 3.0;

        double requiredAmount = rentForTheHall + cakePrice + drinksPrice + animatorPrice;
        System.out.println(requiredAmount);
    }
}
